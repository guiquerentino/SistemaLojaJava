package br.com.ifsp.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.ifsp.model.Venda;

public class VendaMock 
{
    
    private static ArrayList<Venda> listaVendas = new ArrayList<Venda>();
    
    public VendaMock(){
        listaVendas = new ArrayList<Venda>();
    }
    
    public static void salvar(Venda venda) throws Exception {
        listaVendas.add(venda);
    }
    
    public static Venda obterUltima() throws Exception {
        if (listaVendas.size() > 0) {
            
            Venda vendaAuxiliar = listaVendas.get(listaVendas.size()-1);
            
            if (vendaAuxiliar != null) 
            {
                return vendaAuxiliar;
            }
            
        }
        else 
        {
            throw new Exception("Não há dados para pesquisa");
        }
        return null;
    }
    
    public static List<Venda> listar() throws Exception {
        return listaVendas;
    }
    
    public static List<Venda> procurar(Date dataInicio, Date dataFim) throws Exception{
        
        List<Venda> listaResultado = new ArrayList<Venda>();

        return listaResultado;
    }
    
}