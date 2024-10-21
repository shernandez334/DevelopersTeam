package org.example.dao;

import org.example.database.DbInitialSetup;
import org.example.database.DbInitialSetupMySql;
import org.example.entities.Element;

public class MySqlFactory implements DatabaseFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoMySql();
    }

    @Override
    public TicketDao createTicketDao() {
        return new TicketDaoMySql();
    }

    @Override
    public PlayerDao createPlayerDao() {
        return new PlayerDaoMySql();
    }

    @Override
    public NotificationDao createNotificationDao() {
        return new NotificationDaoMySql();
    }

    @Override
    public DbInitialSetup createDbInitialSetup() {
        return new DbInitialSetupMySql();
    }

    @Override
    public PropertiesDao createPropertiesDao() {
        return new PropertiesDaoMySql();
    }
}
