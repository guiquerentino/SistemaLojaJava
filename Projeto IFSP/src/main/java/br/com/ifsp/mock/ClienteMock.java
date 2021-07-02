package br.com.ifsp.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.ifsp.model.Cliente;

public class ClienteMock 
{
    private static int sequenciaIdClientes = 0;
    
    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    
    public ClienteMock(){
        listaClientes = new ArrayList<Cliente>();
    }
    
    public static void salvar(Cliente cliente) throws Exception {
        cliente.setId(sequenciaIdClientes++);
        listaClientes.add(cliente);
    }
    
    public static List<Cliente> listar() throws Exception {
        return listaClientes;
    }
    
    public static List<Cliente> procurar(String nome) throws Exception{
        
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        if (nome != null && listaClientes.size() > 0) {
            
            int contadorPosicao = 0;
            while (contadorPosicao < listaClientes.size()) {

                Cliente clienteAuxiliar = listaClientes.get(contadorPosicao);
                if (clienteAuxiliar != null && clienteAuxiliar.getNome() != null) 
                {
                    if (clienteAuxiliar.getNome().toUpperCase().contains(nome.toUpperCase())) 
                    {
                        listaResultado.add(clienteAuxiliar);
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
    
    public static Cliente obter(int id) throws Exception {
        if (listaClientes.size() > 0) {
            int contadorPosicao = 0;
            while (contadorPosicao < listaClientes.size()) 
            {
                Cliente clienteAuxilizr = listaClientes.get(contadorPosicao);
                if (clienteAuxilizr != null
                        && clienteAuxilizr.getId() != null
                        && clienteAuxilizr.getId() == id) 
                {
                    return clienteAuxilizr;
                }
                contadorPosicao++;
            }
        }
        else 
        {
            throw new Exception("Não há dados para pesquisa");
        }
        return null;
    }
    
    public static Cliente obter2(String cpf) throws Exception {
        if (listaClientes.size() > 0) {
            int contadorPosicao = 0;
            while (contadorPosicao < listaClientes.size()) 
            {
                Cliente clienteAuxilizr = listaClientes.get(contadorPosicao);
                if (clienteAuxilizr != null
                        && clienteAuxilizr.getCpf()!= null
                        && clienteAuxilizr.getCpf().equals(cpf)) 
                {
                    return clienteAuxilizr;
                }
                
                contadorPosicao++;
            }
        }
        else 
        {
            throw new Exception("Não há dados para pesquisa");
        }
        return null;
    }
    
    public static void atualizar(Cliente clienteAtualizado) throws Exception {
        
        if (clienteAtualizado != null
                && clienteAtualizado.getId() != null
                && listaClientes.size() > 0) 
        {

            int contador = 0;
            boolean atualizacao = false;
            
            while (contador < listaClientes.size() && !atualizacao) 
            {
                
                Cliente clienteDesatualizado = listaClientes.get(contador);
                
                if (clienteDesatualizado != null
                    && clienteDesatualizado.getId() == clienteAtualizado.getId()) 
                {
                    clienteDesatualizado.setNome(
                            clienteAtualizado.getNome());
                    clienteDesatualizado.setBairro(
                            clienteAtualizado.getBairro());
                    clienteDesatualizado.setCidade(
                            clienteAtualizado.getCidade());
                    clienteDesatualizado.setCpf(
                            clienteAtualizado.getCpf());
                    clienteDesatualizado.setDataNascimento(
                            clienteAtualizado.getDataNascimento());
                    clienteDesatualizado.setEmail(
                            clienteAtualizado.getEmail());
                    clienteDesatualizado.setEstado(
                            clienteAtualizado.getEstado());
                    clienteDesatualizado.setEstadoCivil(
                            clienteAtualizado.getEstadoCivil());
                    clienteDesatualizado.setLogradouro(
                            clienteAtualizado.getLogradouro());
                    clienteDesatualizado.setNumero(
                            clienteAtualizado.getNumero());
                    clienteDesatualizado.setObservacoes(
                            clienteAtualizado.getObservacoes());
                    clienteDesatualizado.setSexo(
                            clienteAtualizado.getSexo());
                    clienteDesatualizado.setTelefoneCelular(
                            clienteAtualizado.getTelefoneCelular());
                    clienteDesatualizado.setTelefoneOutros(
                            clienteAtualizado.getTelefoneOutros());
                    atualizacao = true;
                }
                contador++;
            }
        }
        else 
        {
            throw new Exception("Não há cliente para atualizar");
        }
    }
    
    public static void excluir(int id) throws Exception {
        if (listaClientes.size() > 0) 
        {
            
            int contadorPosicao = 0;
            boolean removido = false;
            
            while (contadorPosicao < listaClientes.size() && !removido) 
            {
                Cliente clienteAuxiliar = listaClientes.get(contadorPosicao);

                if (clienteAuxiliar != null && clienteAuxiliar.getId() == id) 
                {
                    listaClientes.remove(contadorPosicao);
                    removido = true;
                }
                contadorPosicao++;
            }
        }
        else 
        {
            throw new Exception("Não há cliente para remover");
        }
    }
}