package computer_shop;

/*
1 / creating connection
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test“, ”root”, “root”);
2 / creating statments for insert or select or updata or doing any oreation on databasse 
    PreparedStatement stmt= con.prepareStatement("database statment"); 
        ex :
        1/ insert:PreparedStatement stmt= con.prepareStatement(" insert into Student (firstName, midName, lastName) values (?, ?, ?)"); 
3 / Executing statements for update data from tables like : ( insert , update , delete)
    ex :
       1 / update data : (obj name)stmt.executeUpdate();
       2 / select data
            ResultSet res = stmt.executeQuery(); 
            while( res.next()){
                // can use data from column by index;
            }

*/