public class MyDatabaseFactory {

    public static MyDatabase getMyDatabase(int i) {
        switch (i) {
            case 1:
                return new MysqlDB();
            case 2:
                return new PostgreDB();
            case 3:
                return new OracleDB();
            default:
                return null;
        }
    }
}