package liquibase.database.jvm;

import liquibase.database.Database;
import liquibase.database.DatabaseConnection;
import liquibase.exception.DatabaseException;

import java.sql.Driver;
import java.util.Properties;

public class R2dbcConnection implements DatabaseConnection {
    @Override
    public void open(String url, Driver driverObject, Properties driverProperties) throws DatabaseException {

    }

    @Override
    public void close() throws DatabaseException {

    }

    @Override
    public void commit() throws DatabaseException {

    }

    @Override
    public boolean getAutoCommit() throws DatabaseException {
        return false;
    }

    @Override
    public String getCatalog() throws DatabaseException {
        return "";
    }

    @Override
    public String nativeSQL(String sql) throws DatabaseException {
        return "";
    }

    @Override
    public void rollback() throws DatabaseException {

    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws DatabaseException {

    }

    @Override
    public String getDatabaseProductName() throws DatabaseException {
        return "";
    }

    @Override
    public String getDatabaseProductVersion() throws DatabaseException {
        return "";
    }

    @Override
    public int getDatabaseMajorVersion() throws DatabaseException {
        return 0;
    }

    @Override
    public int getDatabaseMinorVersion() throws DatabaseException {
        return 0;
    }

    @Override
    public String getURL() {
        return "";
    }

    @Override
    public String getConnectionUserName() {
        return "";
    }

    @Override
    public boolean isClosed() throws DatabaseException {
        return false;
    }

    @Override
    public void attached(Database database) {

    }

    @Override
    public int getPriority() {
        return 0;
    }
}
