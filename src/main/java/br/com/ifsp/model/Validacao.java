package br.com.ifsp.model;

import java.util.Date;

public class Validacao 
{
    public static String ProdutoCamposVazios(String nome, String quantidade, 
            String custo, String valor)
    {
        String retorno = "";
        
        if(nome.equalsIgnoreCase("") || nome == "")
        {
            retorno += "Nome\n";
        }

        if(quantidade.equalsIgnoreCase("") || quantidade == "")
        {
            retorno += "Quantidade\n";
        }

        if(custo.equalsIgnoreCase("") || custo == "")
        {
            retorno += "Custo\n";
        }
        if(valor.equalsIgnoreCase("") || valor == "")
        {
            retorno += "Valor\n";
        }
            return retorno;
      }
    
    
    public static String ClienteCamposVazios(String nome, String cpf, 
    String dataNascimento, String estado, String cidade, String bairro, 
    String logradouro, String numero)
    {
        String retorno = "";
        
         if(nome.equalsIgnoreCase("") || nome == "")
        {
            retorno += "Nome\n";
        }
        if(cpf.equalsIgnoreCase("") || cpf == "")
        {
            retorno += "CPF\n";
        }
        if(dataNascimento.equalsIgnoreCase("") || dataNascimento == "")
        {
            retorno += "Data de Nascimento\n";
        }

        if(estado.equalsIgnoreCase("") || estado == "")
        {
            retorno += "Estado\n";
        }
        if(cidade.equalsIgnoreCase("") || cidade == "")
        {
            retorno += "Cidade\n";
        }
        if(bairro.equalsIgnoreCase("") || bairro == "")
        {
            retorno += "Bairro\n";
        }
        if(logradouro.equalsIgnoreCase("") || logradouro == "")
        {
            retorno += "Logradouro\n";
        }
        if(numero.equalsIgnoreCase("") || numero == "")
        {
            retorno += "Número\n";
        }

        return retorno;
    }
    
   
    public static String ProdutoCamposTamanho(String nome, String quantidade, 
            String custo, String valor){
        String resposta = "";
        
        if (nome.length()>40){
            
            resposta += "\nNome (tamanho máximo: 40)";
        }
        
        if (quantidade.length()>3){
            
            resposta += "\nQuantidade (tamanho máximo: 3)";
        }
        
        if (custo.length()>8){
            
            resposta += "\n (tamanho máximo: 8)";
        }
        
        if (valor.length()>8){
            
            resposta += "\nValor (tamanho máximo: 8)";
        }
        
        return resposta;
    }
    
   
    public static String ClienteCamposTamanho(String nome, String cidade, 
    String bairro, String logradouro, String numero, String email, 
    String telefoneCelular, String telefoneOutros, String observacoes){
        String resposta = "";
        
        if (nome.length()>50){
            
            resposta += "\nNome (tamanho máximo: 50)";
        }
        
        if (cidade.length()>50){
            
            resposta += "\nCidade (tamanho máximo: 50)";
        }
        
        if (bairro.length()>50){
            
            resposta += "\nBairro (tamanho máximo: 50)";
        }
        
        if (logradouro.length()>50){
            
            resposta += "\nLogradouro (tamanho máximo: 50)";
        }
        
        if (numero.length()>6){
            
            resposta += "\nNumero (tamanho máximo: 6)";
        }
        
        if (email.length()>50){
            
            resposta += "\nE-mail (tamanho máximo: 50)";
        }
        
        if (telefoneCelular.length()>15){
            
            resposta += "\nTelefone Celular (tamanho máximo: 15)";
        }
        
        if (telefoneOutros.length()>15){
            
            resposta += "\nTelefone (Outros) (tamanho máximo: 15)";
        }
        
        if (observacoes.length()> 500){
            
            resposta += "\nObservações (tamanho máximo: 500)";
        }
        
        return resposta;
    }
    
    public static boolean vendaCliente(String Nome, String Cpf, String Cidade, 
            String Logradouro, String Numero){
        
        if(Nome.equalsIgnoreCase("") || Nome == "")
        {
            return false;
        }
        if(Cpf.equalsIgnoreCase("") || Cpf == "")
        {
            return false;
        }
        if(Cidade.equalsIgnoreCase("") || Cidade == "")
        {
            return false;
        }
        if(Logradouro.equalsIgnoreCase("") || Logradouro == "")
        {
            return false;
        }
        if(Numero.equalsIgnoreCase("") || Numero == "")
        {
            return false;
        }
        return true;
    }
}
