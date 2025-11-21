package org.estga.sg.model;

/* Classe Modelo para a entidade STOCK.
 * Representa a quantidade atual e o nível mínimo de stock de um produto em um armazém.
 * Crucial para RF04 (Atualização Automática) e RF05 (Alerta Proativo).
 */
public class Stock {
    // ---------------------- ATRIBUTOS (PK Composta) ----------------------
    private int idProduto;
    private int idArmazem;

    private int quantidade; // Stock ATUAL (RF04)
    private int minimo;     // Nível mínimo para o alerta (RF05)

    // -------------------- CONSTRUTORES ---------------------

    // Construtor completo: Usado para CRIAR e LER objetos Stock.
    // Como a PK é composta e não é auto-incremento, incluímos todos os campos.
    public Stock(int idProduto, int idArmazem, int quantidade, int minimo) {
        this.idProduto = idProduto;
        this.idArmazem = idArmazem;
        this.quantidade = quantidade;
        this.minimo = minimo;
    }


    // -------------------- GETTERS ---------------------

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdArmazem() {
        return idArmazem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getMinimo() {
        return minimo;
    }

    // -------------------- SETTERS ---------------------

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setIdArmazem(int idArmazem) {
        this.idArmazem = idArmazem;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    // Setter CRÍTICO com validação: A quantidade NUNCA pode ser negativa (RNF03)
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            // Atribuir um valor negativo, lançamos uma exceção.
            throw new IllegalArgumentException("Erro: A quantidade em stock não pode ser negativa.");
        }
    }
}
