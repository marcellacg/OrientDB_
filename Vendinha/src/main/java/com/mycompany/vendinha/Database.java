
package com.mycompany.vendinha;

import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.db.document.ODatabaseDocument;
import com.orientechnologies.orient.core.iterator.ORecordIteratorClass;
import com.orientechnologies.orient.core.record.impl.ODocument;

public class Database {
    
    private OrientDB database = null;
    private ODatabaseDocument db = null;
    private ODocument produtoDeLimpeza = null;
    private ODocument produtoDeHigiene = null;
    private ODocument produtoBebidas = null;
    
    public void abrirBanco () {
        database = new OrientDB("remote:localhost",  OrientDBConfig.defaultConfig());
        db = database.open("Vendinha", "root", "1234");
    }
    
    public void fecharBanco(){
       // db.activateOnCurrentThread();
        db.close();
        database.close();
    }
    
    public void cadastrarProdLimpeza(ProdutoDeLimpeza prod_DeLimpeza){
        abrirBanco();
        produtoDeLimpeza = new ODocument ("ProdutoDeLimpeza"); 
        produtoDeLimpeza.field("nomeProd", prod_DeLimpeza.getNomeProd());
        produtoDeLimpeza.field( "volume", prod_DeLimpeza.getVolume());
        produtoDeLimpeza.field( "marca", prod_DeLimpeza.getMarca());
        produtoDeLimpeza.field( "tipo", prod_DeLimpeza.getTipo());
        db.save(produtoDeLimpeza);
        System.out.println("Produto de limpeza cadastrado com sucesso!");
        fecharBanco();
    }
    
    public void cadastrarProdHigiene(ProdutoDeHigiene prod_DeHigiene){
        abrirBanco();
        produtoDeHigiene = new ODocument ("ProdutoDeHigiene"); 
        produtoDeHigiene.field("nomeProdHigiene", prod_DeHigiene.getNomeProdHigiene());
        produtoDeHigiene.field( "volume", prod_DeHigiene.getVolume());
        produtoDeHigiene.field( "marca", prod_DeHigiene.getMarca());
        produtoDeHigiene.field( "fabricante", prod_DeHigiene.getFabricante());
        produtoDeHigiene.field( "tipo", prod_DeHigiene.getTipo());
        
        db.save(produtoDeHigiene);
        System.out.println("Produto de higiene cadastrado com sucesso!");
        fecharBanco();
    }
    
    public void cadastrarProdBebidas(ProdutoBebidas prod_Bebidas){
        abrirBanco();
        produtoBebidas = new ODocument ("ProdutoBebidas"); 
        produtoBebidas.field("nomeBebida", prod_Bebidas.getNomeBebida());
        produtoBebidas.field( "sabor", prod_Bebidas.getSabor());
        produtoBebidas.field( "volume", prod_Bebidas.getVolume());
        produtoBebidas.field( "marca", prod_Bebidas.getMarca());
        produtoBebidas.field( "tipo", prod_Bebidas.getTipo());
        
        db.save(produtoBebidas);
        System.out.println("Produto bebida cadastrado com sucesso!");
        fecharBanco();
    }
    
    public void consultarProdutos(String nomeConsulta){  
        System.out.println("Listando...");
        abrirBanco();
        ORecordIteratorClass<ODocument> lista = db.browseClass(nomeConsulta);
        fecharBanco();
    }
    
    public void consultaProdutosLimpeza(){
        System.out.println("Listando...");
        abrirBanco();
        ORecordIteratorClass<ODocument> lista = db.browseClass("ProdutoDeLimpeza");
        fecharBanco();
    }
    
    public void consultaProdutosHigiene(){
        System.out.println("Listando...");
        abrirBanco();
        ORecordIteratorClass<ODocument> lista = db.browseClass("ProdutoDeHigiene");
        fecharBanco();
    }
    
    public void consultaProdutoBebidas(){
        System.out.println("Listando...");
        abrirBanco();
        ORecordIteratorClass<ODocument> lista = db.browseClass("ProdutoBebidas");
        fecharBanco();
    }
    
    public void deletar(String nomeProd, String nomeClasse){
        abrirBanco();
        ORecordIteratorClass<ODocument> lista = db.browseClass(nomeClasse); 
        for (ODocument p : lista) {
           if (p.getProperty("nomeProd").equals(nomeProd)){
             p.delete();
             break;
            }
            
        }
        System.out.println("Deletado com sucesso");
        fecharBanco();
    }
    
    public void updateProdLimpeza (String param, String nome) {
        abrirBanco();
        produtoDeLimpeza.field(param, nome);
        produtoDeLimpeza.save();
        System.out.println("Atualizado com sucesso");
        fecharBanco();
    }
    
    public void updateProdHigiene (String param, String nome) {
        abrirBanco();
        produtoDeHigiene.field(param, nome);
        produtoDeHigiene.save();
        System.out.println("Atualizado com sucesso");
        fecharBanco();
    }
    
    public void updateProdBebidas (String param, String nome) {
        abrirBanco();
        produtoBebidas.field(param, nome);
        produtoBebidas.save();
        System.out.println("Atualizado com sucesso");
        fecharBanco();
    }
    
    public void popularBanco(){
        //abrirBanco();
        //novo produto de limpeza
        ProdutoDeLimpeza pl1 = new ProdutoDeLimpeza("Sparkles", "2L", "Stunning", "Sabão líquido");
        //cadastrar produto de limpeza
        cadastrarProdLimpeza(pl1);
        //novo produt de higiene
        ProdutoDeHigiene ph1 = new ProdutoDeHigiene("Brilhante", "22,5g", "ToothAndTooth", "Palm-nature", "creme");
        //cadastrar produto de higiene
        cadastrarProdHigiene(ph1);
        //consultar produtos de limpeza
        ProdutoBebidas pb1 = new ProdutoBebidas("Soda", "refrigerante", "limão", "350ml", "Bubbles");
        //cadastrar produto bebidas
        cadastrarProdBebidas(pb1);
        
        //consulta bebidas
        consultaProdutoBebidas();
        //consulta produtos de limpeza
        consultaProdutosLimpeza();
        //consultar produtos de higiene
        consultaProdutosHigiene();
        //atualizar produto de higiene
        updateProdHigiene("nomeProdHigiene", "Shinee");
        //consultar produto de higiene
        consultaProdutosHigiene();
        //deletar produto de limpeza
        deletar("Sparkles", "ProdutoDeLimpeza");
        
       // fecharBanco();
    }


}
