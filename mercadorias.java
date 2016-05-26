
package br.mercado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.mercado.dto.Vendas;
import br.mercado.jdbc.ConexaoUtil;


public class mercadorias {
    
    public void insetir(Vendas venda) throws SQLException, ClassNotFoundException{
        try{
        
        Connection connection = ConexaoUtil.getInstance().getConnection() ;

        String sql = "INSERT INTO MERCADO(ID_MERCADORIA,NOME,TIPODONEGOCIO,TIPODAMERCADORIA) VALUES (?,?,?,?)";
    
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, Vendas.setId());
        statement.setString(2, Vendas.getnome());
        statement.setString(3, Vendas.gettipoDoNegocio());
        statement.setString(4, Vendas.gettipo());
        
        statement.execute();
        statement.close();
        
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
}
