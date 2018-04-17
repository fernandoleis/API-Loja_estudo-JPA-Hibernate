package br.com.caelum;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaPool {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = (ComboPooledDataSource) new JpaConfigurator().getDataSource();
        Connection connection = dataSource.getConnection();
        Connection connection2 = dataSource.getConnection();
        Connection connection3 = dataSource.getConnection();
        Connection connection4 = dataSource.getConnection();
        Connection connection5 = dataSource.getConnection();

        System.out.println("dataSource.getNumBusyConnections() = " + dataSource.getNumBusyConnections());
        System.out.println("dataSource.getNumIdleConnections() = " + dataSource.getNumIdleConnections());

    }
}
