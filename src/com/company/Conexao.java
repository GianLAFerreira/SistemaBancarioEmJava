package com.company;

public class Conexao implements AutoCloseable{
    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Ocorreu um erro");
        }


        /* código legado */
//        Conexao con = null;
//        try{
//            con = new Conexao();
//            con.leDados();
//
//        }catch (IllegalAccessError ex){
//            System.out.println("Ocorreu um erro");
//        }finally {
//            con.close();
//        }

    }


    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
       // throw new IllegalStateException();
    }

    @Override
    public void close(){
        System.out.println("Fechando conexão");
    }
}