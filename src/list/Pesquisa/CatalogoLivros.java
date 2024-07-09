package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;        
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("titulo1", "autor1", 2020);
        catalogoLivros.adicionarLivro("titulo1", "autor2", 1953);
        catalogoLivros.adicionarLivro("titulo2", "autor1", 2018);
        catalogoLivros.adicionarLivro("titulo3", "autor2", 2001);
        catalogoLivros.adicionarLivro("titulo4", "autor3", 1994);
        
        System.out.println(catalogoLivros.pesquisarAutor("autor1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1994, 2010));
        System.out.println(catalogoLivros.pesquisarPorTitulo("titulo1"));
    }

    
}
