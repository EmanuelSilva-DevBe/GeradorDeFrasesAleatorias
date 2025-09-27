package com.Emanuel.ScreenMusic.Main;

import java.util.Scanner;

public class Principal {
    Scanner s = new Scanner(System.in);

        public void exibeMenu() {
            var opcao = -1;

            while (opcao!= 0) {
                var menu = """
                    *** Screen Sound Músicas ***                    
                                        
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                                    
                    0 - Sair
                    
                    Digite a opção desejada:
                    """;

                System.out.println(menu);
                opcao = s.nextInt();
                s.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarArtistas();
                        break;
                    case 2:
                        cadastrarMusicas();
                        break;
                    case 3:
                        listarMusicas();
                        break;
                    case 4:
                        buscarMusicasPorArtista();
                        break;
                    case 5:
                        pesquisarDadosDoArtista();
                        break;
                    case 0:
                        System.out.println("Encerrando a aplicação!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }

    private void pesquisarDadosDoArtista() {
    }

    private void buscarMusicasPorArtista() {
    }

    private void listarMusicas() {
    }

    private void cadastrarMusicas() {
    }

    private void cadastrarArtistas() {
    }
}
