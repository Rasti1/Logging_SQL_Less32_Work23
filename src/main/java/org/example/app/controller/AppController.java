package org.example.app.controller;

import org.example.app.repository.UserRepository;
import org.example.app.service.UserService;
import org.example.app.view.AppView;
import org.example.app.view.UserView;

public class AppController {

    UserRepository repository = new UserRepository();
    AppView view = new AppView();
    UserService service = new UserService(repository);
    UserView userView = new UserView();


    public void runApp(){


        while (true){

            int option = view.getMenu();
            switch (option){

                case 1 -> {
                    userView.getOutput(service.create(userView.getCreateData()));
                }
                case 2 -> {
                    userView.getOutput(service.read());
                }
                case 3 -> {
                    userView.getOutput(service.update(userView.getUpdateData()));
                }
                case 4 -> {
                    userView.getOutput(service.delete(userView.getDeleteData()));
                }
                case 5 -> {
                    userView.getOutput(service.readById(userView.getByIDData()));
                }
                case 0 -> {
                    userView.getOutput("App closed.");
                    System.exit(0);
                }
                default -> userView.getOutput("Invalid value. Try again.");
            }
        }
    }
}
