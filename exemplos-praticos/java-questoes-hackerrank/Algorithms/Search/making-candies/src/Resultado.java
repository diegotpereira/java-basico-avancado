// Descrição:
// Você é um fabricante de doces e deseja fabricar a maior quantidade possível de doces. No entanto, existem 
// certas restrições em relação à produção diária, compra de máquinas e outros fatores.

// Você começa com M máquinas, W trabalhadores, P doces e N moedas. O objetivo é produzir a maior quantidade possível 
// de doces em D dias.

// A cada dia, você pode tomar uma das três ações:

// Produção de Doces: Gaste N moedas para produzir P doces, reduzindo o saldo de moedas e aumentando o estoque de doces.
// Compra de Máquinas ou Contratação de Trabalhadores: Gaste doces para comprar máquinas ou contratar trabalhadores, 
// aumentando a capacidade de produção.
// Espera: Não faça nada em um dia.
// O objetivo é maximizar a quantidade total de doces produzidos após D dias.

// Você deve implementar uma função chamada minimumPasses(m, w, p, n), onde:

// m: o número inicial de máquinas
// w: o número inicial de trabalhadores
// p: o custo para produzir doces
// n: a quantidade de doces que você deseja produzir

public class Resultado {

    public static long minimumPasses(long numeroInicialMaquinas, long numeroInicialTrabalhadores, long custoOperacao,
            long numeroDocesAhProduzir) {
        
        // Quantidade de doces
        long doce = 0L;

        // Contagem de dias
        long contarDias = 0L;

        // Quantidade de doces produzidos por dia
        long producao = 0L;

        // Quantidade de doces que podem ser vendidos
        long podeVendar = 0L;

        // Verificação inicial: Se a produção inicial é suficiente para atender à demanda
        if (numeroDocesAhProduzir / numeroInicialMaquinas <= numeroInicialTrabalhadores) return 1;

        // Cálculo dos dias restantes para atender à demanda
        long diasRestantes = numeroDocesAhProduzir % (numeroInicialMaquinas * numeroInicialTrabalhadores) == 0 ? 
            numeroDocesAhProduzir / (numeroInicialMaquinas * numeroInicialTrabalhadores) : 
            (numeroDocesAhProduzir / (numeroInicialMaquinas * numeroInicialTrabalhadores)) + 1;

        // Loop principal para calcular os dias necessários
        while (contarDias <= diasRestantes) {
            
            // Verificação de estouro
            if(Long.MAX_VALUE / numeroInicialMaquinas <= numeroInicialTrabalhadores) return contarDias + 1;

            // Cálculo da produção diária
            producao = numeroInicialMaquinas * numeroInicialTrabalhadores;

            // Verificação se é necessário produzir mais antes de vender
            if (doce + producao < custoOperacao) {

                // Verifica quantos dias precisam ser adicionados ao contador de dias para alcançar o custo de operação
                // A subtração de 1 é usada para compensar o incremento automático no final do loop principal
                contarDias = contarDias + ((custoOperacao - doce) / producao) - 1;

                // Calcula a quantidade de doces adicionais necessários para atingir o custo de operação
                // O valor é subtraído do estoque de doces e é equivalente a (m * w) vezes a diferença entre o custo e os doces disponíveis
                doce += (numeroInicialMaquinas * numeroInicialTrabalhadores) * ((custoOperacao - doce) / producao) - (numeroInicialMaquinas * numeroInicialTrabalhadores);
            }

            // Cálculo da quantidade de doces que podem ser vendidos
            podeVendar = (producao + doce) / custoOperacao;

            // Verifica se a produção atual mais o estoque de doces é menor que o número total de doces a serem produzidos,
            // e se existe a possibilidade de vender doces
            if (producao + doce < numeroDocesAhProduzir && podeVendar > 0) {
                
                // Calcula a quantidade de doces de venda (diferença entre máquinas e trabalhadores)
                long venda = Math.abs(numeroInicialMaquinas - numeroInicialTrabalhadores);

                // Verifica se a quantidade de doces que podem ser vendidos é maior que a quantidade de doces de venda
                if (podeVendar > venda) {
                    
                    // Define o número de máquinas para ser o maior entre o número atual de máquinas e trabalhadores
                    numeroInicialMaquinas = Math.max(numeroInicialMaquinas, numeroInicialTrabalhadores);


                    // Calcula quantas máquinas devem ser adicionadas, considerando o excedente após a venda
                    // O cálculo depende se a diferença entre podeVendar e venda é ímpar ou par
                    numeroInicialMaquinas = ((podeVendar - venda) % 2) == 1 

                       ? numeroInicialMaquinas + ((podeVendar - venda) / 2) + 1 
                       : numeroInicialMaquinas + ((podeVendar - venda) / 2);

                    // Calcula o número de trabalhadores com base na mesma diferença, para manter o equilíbrio
                    numeroInicialTrabalhadores = ((podeVendar - venda) % 2) == 1 
                       ? numeroInicialMaquinas - 1 
                       : numeroInicialMaquinas;
                        
                } else {

                    // Verifica se há mais máquinas ou mais trabalhadores
                    if (numeroInicialMaquinas > numeroInicialTrabalhadores) {
                        
                        // Se há mais máquinas, adiciona o número de doces de venda aos trabalhadores
                        numeroInicialTrabalhadores += podeVendar;

                    } else {

                        // Se há mais trabalhadores, adiciona o número de doces de venda às máquinas
                        numeroInicialMaquinas += podeVendar;
                    }
                }

                // Subtrai a quantidade de doces vendidos multiplicada pelo custo de operação do total de produção
                producao -= podeVendar * custoOperacao;
            }

            // Atualização da quantidade de doces e dos dias restantes
            // Adiciona a produção atual ao estoque de doces
            doce += producao;

            // Incrementa o contador de dias para acompanhar a passagem dos dias
            contarDias++;

            // Calcula os dias restantes com base no estoque de doces atual, considerando o número total de doces a serem produzidos
            diasRestantes = Math.min(diasRestantes, contarDias + (((numeroDocesAhProduzir - doce) % (numeroInicialMaquinas * numeroInicialTrabalhadores)) == 0 
                ? ((numeroDocesAhProduzir - doce) / (numeroInicialMaquinas * numeroInicialTrabalhadores)) 
                : ((numeroDocesAhProduzir - doce) / (numeroInicialMaquinas * numeroInicialTrabalhadores)) + 1L));
        }

        // Retorna o menor valor entre a contagem de dias e os dias restantes
        return Math.min(contarDias, diasRestantes);
    }

}
