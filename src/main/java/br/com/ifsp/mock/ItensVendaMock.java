package br.com.ifsp.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.ifsp.model.ItemVenda;

public class ItensVendaMock 
{
    private static ArrayList<ItemVenda> listaItensVenda = new ArrayList<ItemVenda>();
    
    public ItensVendaMock(){
        listaItensVenda = new ArrayList<ItemVenda>();
    }
    
    public static void salvar(ItemVenda itensVenda) throws Exception {
        listaItensVenda.add(itensVenda);
    }
    
    public static List<ItemVenda> obterItens(int idVenda) throws Exception{
        
        List<ItemVenda> listaResultado = new ArrayList<ItemVenda>();
        
        if (listaItensVenda.size() > 0) {
            
            int contadorPosicao = 0;
            while (contadorPosicao < listaItensVenda.size()) {

                ItemVenda itemVendaAuxiliar = listaItensVenda.get(contadorPosicao);
                if (itemVendaAuxiliar != null && itemVendaAuxiliar.getIdVenda()!= null) 
                {
                    if (itemVendaAuxiliar.getIdVenda() == idVenda) 
                    {
                        listaResultado.add(itemVendaAuxiliar);
                    }
                }
                contadorPosicao++;
            }
        }
        else
        {
            throw new Exception("Não há dados para pesquisa");
        }
        return listaResultado;
    }
    
}