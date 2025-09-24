/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_04;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud 6298805
 * https://github.com/waffleprinter/Lab_04.git
 */
public class Lab_04 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        // ----STRUCTURE----
        BorderPane root = new BorderPane();
        
        GridPane grid = new GridPane();      
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        root.setCenter(grid);
        
        // ----USER INFO----
        Label daysLabel = new Label("Days spent: ");
        TextField days = new TextField();
        grid.add(daysLabel, 0, 0);
        grid.add(days, 1, 0);
        
        Label airfareLabel = new Label("Airfare: ");
        TextField airfare = new TextField();
        grid.add(airfareLabel, 0, 1);
        grid.add(airfare, 1, 1);
        
        Label rentalFeesLabel = new Label("Rental fees: ");
        TextField rentalFees = new TextField();
        grid.add(rentalFeesLabel, 0, 2);
        grid.add(rentalFees, 1, 2);
        
        Label milesDrivenLabel = new Label("Miles driven: ");
        TextField milesDriven = new TextField();
        grid.add(milesDrivenLabel, 0, 3);
        grid.add(milesDriven, 1, 3);
        
        Label parkingFeesLabel = new Label("Parking fees: ");
        TextField parkingFees = new TextField();
        grid.add(parkingFeesLabel, 0, 4);
        grid.add(parkingFees, 1, 4);
        
        Label taxiChargesLabel = new Label("Taxi charges: ");
        TextField taxiCharges = new TextField();
        grid.add(taxiChargesLabel, 0, 5);
        grid.add(taxiCharges, 1, 5);
        
        Label registrationFeesLabel = new Label("Conference registration fees: ");
        TextField registrationFees = new TextField();
        grid.add(registrationFeesLabel, 0, 6);
        grid.add(registrationFees, 1, 6);
        
        Label lodgingChargesLabel = new Label("Daily lodging charge: ");
        TextField lodgingCharges = new TextField();
        grid.add(lodgingChargesLabel, 0, 7);
        grid.add(lodgingCharges, 1, 7);
        
        // ----REIMBURSALS----
        Label expensesLabel = new Label("Expenses: ");
        Text expenses = new Text();
        grid.add(expensesLabel, 2, 0);
        grid.add(expenses, 3, 0);
        
        Label mealsReimbursalsLabel = new Label("Meals Reimbursal: ");
        Text mealsReimbursal = new Text();
        grid.add(mealsReimbursalsLabel, 2, 1);
        grid.add(mealsReimbursal, 3, 1);
        
        Label parkingReimbursalLabel = new Label("Parking Reimbursal: ");
        Text parkingReimbursal = new Text();
        grid.add(parkingReimbursalLabel, 2, 2);
        grid.add(parkingReimbursal, 3, 2);
        
        Label taxiReimbursalLabel = new Label("Taxi Reimbursal: ");
        Text taxiReimbursal = new Text();
        grid.add(taxiReimbursalLabel, 2, 3);
        grid.add(taxiReimbursal, 3, 3);
        
        Label lodgingReimbursalLabel = new Label("Logdging Reimbursal: ");
        Text lodgingReimbursal = new Text();
        grid.add(lodgingReimbursalLabel, 2, 4);
        grid.add(lodgingReimbursal, 3, 4);
        
        Label fuelReimbursalLabel = new Label("Fuel Reimbursal: ");
        Text fuelReimbursal = new Text();
        grid.add(fuelReimbursalLabel, 2, 5);
        grid.add(fuelReimbursal, 3, 5);

        
        
        // ----SHOW SCENE----
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
}
