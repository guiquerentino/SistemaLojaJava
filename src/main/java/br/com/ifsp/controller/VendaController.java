package br.com.ifsp.controller;

import br.com.ifsp.dao.VendaDao;
import br.com.ifsp.mock.VendaMock;
import br.com.ifsp.model.Venda;

import java.util.Date;
import java.util.List;

public class VendaController {
    
   
    public static String salvar(Venda venda){
        
        String resposta = null;
        
      
        try{
            
            VendaDao.salvar(venda);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
   
    public static List<Venda> procurar(String dataInicio, String dataFim){
        List<Venda> listaResposta = null;
        
       
        try{
        
            if (dataInicio == null || dataFim == null) {
               
                listaResposta = VendaDao.listar();
            } else {
                
                listaResposta = VendaDao.procurar(dataInicio, dataFim);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
    
  
    public static Venda obterUltima() {
        
        
        Venda venda =  new Venda();
        
        try 
        {
            
            venda = VendaDao.obterUltima();
        } 
        catch (Exception e) 
        {
            
        }

        return venda;
        
    }
}
