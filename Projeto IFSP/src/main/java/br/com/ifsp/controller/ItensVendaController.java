package br.com.ifsp.controller;

import br.com.ifsp.dao.ItensVendaDao;
import br.com.ifsp.mock.ItensVendaMock;
import br.com.ifsp.model.ItemVenda;

import java.util.List;


public class ItensVendaController {
    
   
    public static String salvar(ItemVenda itensVenda){
        
        String resposta = null;
        
       
        try{
           
            ItensVendaDao.salvar(itensVenda);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
   
    public static List<ItemVenda> obterItens(int idVenda){
        List<ItemVenda> listaResposta = null;
        
       
        try{
           
            listaResposta = ItensVendaDao.obterItens(idVenda);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
}
