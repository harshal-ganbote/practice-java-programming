package modules.M11_Backend_LLD.L3_Design_Patterns_Introduction_and_Singleton.Assignment.Assignment3;

import java.util.LinkedList;
import java.util.Queue;

class ConnectionPoolImpl implements ConnectionPool {
  private static ConnectionPoolImpl connectionPool;
  private final int maxConnections;
  private Queue<DatabaseConnection> dbQueue;

  private ConnectionPoolImpl(int maxConnections) {
    this.maxConnections = maxConnections;
    this.dbQueue = new LinkedList<>();
    initializePool();
  }

  public static ConnectionPool getInstance(int maxConnections) {
    if (connectionPool != null) {
      return connectionPool;
    }

   synchronized (ConnectionPoolImpl.class) {
      if (connectionPool == null) {
        connectionPool = new ConnectionPoolImpl(maxConnections);
      }
   }

    return connectionPool;
  }

  public static void resetInstance() {
    connectionPool = null;
  }

  @Override
  public void initializePool() {
    for (int connection = 1; connection <= maxConnections; connection++) {
      dbQueue.add(new DatabaseConnection());
    }
  }

  @Override
  public DatabaseConnection getConnection() {
    return dbQueue.poll();
  }

  @Override
  public void releaseConnection(DatabaseConnection connection) {
    dbQueue.add(connection);
  }

  @Override
  public int getAvailableConnectionsCount() {
    return dbQueue.size();
  }

  @Override
  public int getTotalConnectionsCount() {
    return this.maxConnections;
  }
}
