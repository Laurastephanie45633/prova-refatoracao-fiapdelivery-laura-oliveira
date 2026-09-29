package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("Sistema FiapDelivery\n");

        // Teste de blindagem e validação de dados inválidos
        
        System.out.println("Teste blindagem com Capacidade negativa");
        Caminhao caminhaoComErro = new Caminhao("XYZ9999", -500.0, 3);
        System.out.println("Capacidade atribuída após bloqueio: " + caminhaoComErro.getCapacidadeCarga() + " kg\n");

        // Criando objetos com construtores
        
        System.out.println("Cadastro de novos veículos: ");
        Caminhao caminhao1 = new Caminhao("ABC1234", 12000.0, 4);
        Moto moto1 = new Moto("MTO5678", 80.0, true);

        System.out.println("Caminhão cadastrado | Placa: " + caminhao1.getPlaca() 
                           + " | Eixos: " + caminhao1.getQuantidadeEixos());
        System.out.println("Moto cadastrada     | Placa: " + moto1.getPlaca() 
                           + " | Tem Baú: " + (moto1.isTemBau() ? "Sim" : "Não") + "\n");

        // Criando pacotes
        
        System.out.println("Cadastro de pacotes: ");
        Pacote pacote1 = new Pacote("BR999", 10.5);
        Pacote pacote2 = new Pacote("BR888", 2.0);

        // teste da associação 
        System.out.println("Executando Rotas (Caminhão vs Moto)");
        
        // Rota 1 utilizando Caminhão
        Rota rota1 = new Rota(pacote1, caminhao1);
        rota1.executarRota();

        // Rota 2 utilizando Moto 
        Rota rota2 = new Rota(pacote2, moto1);
        rota2.executarRota();

        // Atualização do dtatus dos pacotes via Método de Negócio
        System.out.println("\nAtualizando o status das entregas");
        pacote1.atualizarStatus("Em Trânsito");
        pacote2.atualizarStatus("Entregue");
    }
}