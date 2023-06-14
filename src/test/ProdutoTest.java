import br.com.josue.projetoJPA.IProdutoDAO;
import br.com.josue.projetoJPA.Produto;
import br.com.josue.projetoJPA.ProdutoDAO;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDAO DAOProduto;

    public ProdutoTest() {
        DAOProduto = new ProdutoDAO();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("19923");
        produto.setDescricao("Um lindo relógio de pulso");
        produto.setNome("Relógio");
        produto = DAOProduto.cadastrar(produto);

        assertNotNull (produto);
        assertNotNull(produto.getId());
    }
}
