package org.estga.sg.model;

import java.time.LocalDateTime;

/*Classe Modelo para a entidade MOVIMENTO.
 * Representa uma transação única de stock (Entrada 'E' ou Saída 'S').
 * Responsabilidades Chave:
 - Registrar o tipo e a data/hora da transação (RF02, RF03).
 - Manter a integridade da ligação ao Cliente ou Fornecedor (RNF03).
 - Servir como base para o Relatório de Histórico de Movimentos (RF07).
 */

public class Movimento {


    private int idMovimento;
    private LocalDateTime dataHora;
    private char tipoMovimento; // 'E' para Entrada, 'S' para Saída
    private Integer idFornecedor; // Pode ser null
    private Integer idCliente;    // Pode ser null


    // -------------------- CONSTRUTORES ---------------------
    // Construtor para criar um Novo Movimento
    public Movimento(LocalDateTime dataHora, char tipoMovimento, Integer idFornecedor, Integer idCliente) {
        this.dataHora = dataHora;
        this.tipoMovimento = tipoMovimento;
        this.idFornecedor = idFornecedor;
        this.idCliente = idCliente;
    }

    // Construtor para LER/RECUPERAR um Movimento da BDados
    public Movimento(int idMovimento, LocalDateTime dataHora, char tipoMovimento, Integer idFornecedor, Integer idCliente) {
        this.idMovimento = idMovimento;
        this.dataHora = dataHora;
        this.tipoMovimento = tipoMovimento;
        this.idFornecedor = idFornecedor;
        this.idCliente = idCliente;
    }

    // -------------------- GETTERS ---------------------
    public int getIdMovimento() {
        return idMovimento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public char getTipoMovimento() {
        return tipoMovimento;
    }

    //IdFornecedor (pode ser null)
    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    //IdCliente (pode ser null)
    public Integer getIdCliente() {
        return idCliente;
    }

    // -------------------- SETTERS ---------------------

    public void setTipoMovimento(char tipoMovimento) {
        if (tipoMovimento == 'E' || tipoMovimento == 'S') {
            this.tipoMovimento = tipoMovimento;
        } else {
            // Atribuir um valor difenrente de E/S, lançamos uma exceção.
            throw new IllegalArgumentException("Tipo de movimento inválido. Use 'E' ou 'S'.");
        }
    }

    public void setIdMovimento(int idMovimento) {
        this.idMovimento = idMovimento;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}



