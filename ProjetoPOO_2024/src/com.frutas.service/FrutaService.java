package com.frutas.service;

import com.frutas.model.Fruta;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FrutaService {
    public void salvarFrutas(String nomeArquivo, List<Fruta> frutas, String nomeComprador, String cpfComprador, String tipoEntrega, String enderecoEntrega) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write("Nome do Comprador: " + nomeComprador);
            writer.newLine();
            writer.write("CPF do Comprador: " + cpfComprador);
            writer.newLine();
            writer.write("Tipo de Entrega: " + tipoEntrega);
            writer.newLine();
            if (!enderecoEntrega.isEmpty()) {
                writer.write("Endereço de Entrega: " + enderecoEntrega);
                writer.newLine();
            }
            writer.newLine();
            writer.write("Carrinho de Compras:");
            writer.newLine();
            double total = 0.0;
            for (Fruta fruta : frutas) {
                writer.write("- " + fruta.getNome() + " - R$ " + fruta.getPreco() + " - Quantidade: " + fruta.getQuantidade());
                writer.newLine();
                total += fruta.getPreco() * fruta.getQuantidade();
            }
            writer.write("Total a pagar: R$ " + total);
        }
    }
}