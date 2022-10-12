package livraria.models;

import java.util.Date;

public class Edicao {
    private int id;
    private String isbn;
    private Float preco;
    private Date ano;
    private int n_paginas;
    private int quant_estoque;
    
    
    // Getter and settters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }
    
    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }
    
    public int getQuant_estoque() {
        return quant_estoque;
    }

    public void setQuant_estoque(int quant_estoque) {
        this.quant_estoque = quant_estoque;
    }
}