package br.com.ifsp.controller;

import br.com.ifsp.dao.ClienteDao;
import br.com.ifsp.mock.ClienteMock;
import br.com.ifsp.model.Cliente;

import java.util.List;


public class ClienteController {
    
   
    public static String salvar(Cliente cliente){
        
        String resposta = null;
        
 
        try{
          
            ClienteDao.salvar(cliente);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    

    public static List<Cliente> procurar(String nome){
        List<Cliente> listaResposta = null;
        
     
        try{
        
            if (nome == null || "".equals(nome)) {
         
                listaResposta = ClienteDao.listar();
            } else {
         
                listaResposta = ClienteDao.procurar(nome);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
    
  
    public static String atualizar(Cliente cliente) 
    {
        String resposta = null;

        try
        {
           
            ClienteDao.atualizar(cliente);
        } 
        catch (Exception e) 
        {   
            
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;        
    }
    
    
    public static String excluir(Integer id) 
    {
        String resposta = null;

        try 
        {   
            
            ClienteDao.excluir(id);
        } catch (Exception e) 
        {
            
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    
    public static Cliente obter(Integer id) {
        
        
        Cliente cliente =  new Cliente();
        
        try 
        {
            
            cliente = ClienteDao.obter(id);
        } 
        catch (Exception e) 
        {
            
            e.printStackTrace();
        }

        return cliente;
    }
    
    
    public static Cliente obter2(String cpf) {
        
        
        Cliente cliente =  new Cliente();
        
        try 
        {
            
            cliente = ClienteDao.obter2(cpf);
        } 
        catch (Exception e) 
        {
            return cliente = null;
        }

        return cliente;
    }
}
