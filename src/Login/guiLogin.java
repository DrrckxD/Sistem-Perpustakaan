package Login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class guiLogin extends Application {
    @Override
    public void  start(Stage primaryStage) {

        ComboBox<String> comboUser = new ComboBox<>();
        comboUser.getItems().addAll(
                "Mahasiswa",
                "Admin",
                "Author"


        );
        comboUser.setPromptText("Pilih Pengguna");

        Button memilih = new Button("Anda Login Sebagai");
        memilih.setOnAction(e->{
         String pilihan = comboUser.getValue();
         if (pilihan != null){
             Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
             alert1.setTitle("Pilihan Sebagai");
             alert1.setHeaderText(null);
             alert1.setContentText("Kamu Memilih Sebagai: " + pilihan );
             alert1.showAndWait();

         }else {
             Alert alert = new Alert(Alert.AlertType.WARNING);
             alert.setTitle("Peringatan");
             alert.setHeaderText(null);
             alert.setContentText("Silahkan Memilih Terlebih Dahulu!!!");
             alert.showAndWait();
         }
        });

        RadioButton laki = new RadioButton("Laki-Laki");
        RadioButton perempuan = new RadioButton("Perempuan");
        ToggleGroup genderGroup = new ToggleGroup();
        laki.setToggleGroup(genderGroup);
        perempuan.setToggleGroup(genderGroup);






        TextField textField = new TextField();
        TextField textField1 = new TextField();

        Button button = new Button("Login");

        button.setOnAction(e ->{
            String nama1 = textField.getText();
            String password = textField1.getText();
            RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();
            String gender = (selectedGender != null) ? selectedGender.getText() : "Belum memilih";
            String pilihan = comboUser.getValue();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Berhasil");
            alert.setContentText( nama1 + " Berhasil Login!!! ");
            alert.showAndWait();
        });


        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(new Label("Nama:"),0,0);
        gridPane.add(textField,1,0);
        gridPane.add(new Label("Password:"),0,1);
        gridPane.add(textField1,1,1);
        gridPane.add(new Label("Jenis Kelamin"),0,2);
        gridPane.add(laki,1,2);
        gridPane.add(perempuan,2,2);
        gridPane.add(new Label("Pengguna:"),0,3);
        gridPane.add(comboUser,1,3);
        gridPane.add(button,1,4);


        Scene scene = new Scene(gridPane,400,250);








        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplikasi Login Perpustakaan");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
