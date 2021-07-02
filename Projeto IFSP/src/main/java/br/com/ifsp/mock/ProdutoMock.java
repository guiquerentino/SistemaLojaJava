package br.com.ifsp.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.ifsp.model.Produto;


public class ProdutoMock 
{
    private static int sequenciaIdProdutos = 0;
    
    private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    
    public ProdutoMock(){
        listaProdutos = new ArrayList<Produto>();
    }
    
    public static void salvar(Produto produto) throws Exception {
        produto.setId(sequenciaIdProdutos++);
        listaProdutos.add(produto);
    }
    
    public static List<Produto> listar() throws Exception {
        return listaProdutos;
    }
    
    public static List<Produto> procurar(String nome) throws Exception{
        
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if (nome != null && listaProdutos.size() > 0) {
            
            int contadorPosicao = 0;
            while (contadorPosicao < listaProdutos.size()) {

                Produto produtoAuxiliar = listaProdutos.get(contadorPosicao);
                if (produtoAuxiliar != null && produtoAuxiliar.getNome() != null) 
                {
                    if (produtoAuxiliar.getNome().toUpperCase().contains(nome.toUpperCase())) 
                    {
                        listaResultado.add(produtoAuxiliar);
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
    
    public static Produto obter(int id) throws Exception {
        if (listaProdutos.size() > 0) {
            int contadorPosicao = 0;
            while (contadorPosicao < listaProdutos.size()) 
            {
                Produto produtoAuxiliar = listaProdutos.get(contadorPosicao);
                if (produtoAuxiliar != null
                        && produtoAuxiliar.getId() != null
                        && produtoAuxiliar.getId() == id) 
                {
                    return produtoAuxiliar;
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
    
    public static void atualizar(Produto produtoAtualizado) throws Exception {
        
        if (produtoAtualizado != null
                && produtoAtualizado.getId() != null
                && listaProdutos.size() > 0) 
        {

            int contador = 0;
            boolean atualizacao = false;
            
            while (contador < listaProdutos.size() && !atualizacao) 
            {
                
                Produto produtoDesatualizado = listaProdutos.get(contador);
                
                if (produtoDesatualizado != null
                    && produtoDesatualizado.getId() == produtoAtualizado.getId()) 
                {
                    produtoDesatualizado.setNome(
                            produtoAtualizado.getNome());
                    produtoDesatualizado.setCategoria(
                            produtoAtualizado.getCategoria());
                    produtoDesatualizado.setQuantidade(
                            produtoAtualizado.getQuantidade());
                    produtoDesatualizado.setCusto(
                            produtoAtualizado.getCusto());
                    produtoDesatualizado.setValor(
                            produtoAtualizado.getValor());
                    produtoDesatualizado.setDescricao(
                            produtoAtualizado.getDescricao());
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
        if (listaProdutos.size() > 0) 
        {
            
            int contadorPosicao = 0;
            boolean removido = false;
            
            while (contadorPosicao < listaProdutos.size() && !removido) 
            {
                Produto produtoAuxiliar = listaProdutos.get(contadorPosicao);

                if (produtoAuxiliar != null && produtoAuxiliar.getId() == id) 
                {
                    listaProdutos.remove(contadorPosicao);
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