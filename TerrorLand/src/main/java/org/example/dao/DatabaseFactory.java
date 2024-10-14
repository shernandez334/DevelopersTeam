package org.example.dao;

import org.example.database.DbInitialSetup;
import org.example.enums.FileProps;
import org.example.enums.Properties;

public interface DatabaseFactory {

    UserDao createUserDao();
    ElementDao createElementDao();
    TicketDao createTicketDao();
    PlayerDao createPlayerDao();
    NotificationDao createNotificationDao();
    DbInitialSetup createDbInitialSetup();
    PropertiesDao createPropertiesDao();

    /**
     * @deprecated
     * Use FactoryProvider.getInstance().getFactory() instead.
     */
    @Deprecated
    public static DatabaseFactory get(){
        if (Properties.getProperty(FileProps.PROVIDER.getValue()).equalsIgnoreCase("mysql")){
            return MySqlFactory.getInstance();
        }else {
            System.out.printf("'%s' is not valid as a database provider. Fix the properties file.",
                    FileProps.PROVIDER.getValue());
            throw new RuntimeException();
        }
    }
}
