package modules.M11_Backend_LLD.L3_Design_Patterns_Introduction_and_Singleton.Assignment.Assignment3;

interface ConnectionPool {
  void initializePool();

  DatabaseConnection getConnection();

  void releaseConnection(DatabaseConnection connection);

  int getAvailableConnectionsCount();

  int getTotalConnectionsCount();

}
