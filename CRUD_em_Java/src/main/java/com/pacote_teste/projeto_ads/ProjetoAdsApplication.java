package com.pacote_teste.projeto_ads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoAdsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjetoAdsApplication.class, args);

        // Criar uma instância de Task
        Task task = new Task("Título da Tarefa", "Descrição da Tarefa", "Em andamento");

        // Imprimir o conteúdo da instância de Task
        System.out.println(task);
    }
}

class Task {
    private String titulo;
    private String descricao;
    private String status;

    public Task(String titulo, String descricao, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
