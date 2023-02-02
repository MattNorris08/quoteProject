import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        var basePrice = 100;

        JOptionPane.showMessageDialog(null, "Type the ages of a family member and press next. When you have inputted all ages type '0' to calculate final quote.");
        JOptionPane.showMessageDialog(null, "This calculator works with any age including and greater than one, and can calculate quotes for up to 8 people.");
        int age1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of your first family member"));

        if(age1 <= 15){
            basePrice = basePrice + 10;
        } else if(age1 >= 18){
            basePrice = basePrice + 50;
        } else if(age1 >= 55){
            basePrice = basePrice +100;
        } else{
        }

        int age2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of your second family member"));

        if(age2 <= 15){
            basePrice = basePrice + 10;
        } else if(age2 >= 18){
            basePrice = basePrice + 50;
        } else if(age2 >= 55){
            basePrice = basePrice +100;
        } else if(age2 == 0){
            JOptionPane.showMessageDialog(null, "Your final quote is " + basePrice);
        } else{
            JOptionPane.showMessageDialog(null, "There was an error. Please close this window and start over");
        }

        int age3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of your third family member"));

        if(age3 <= 15){
            basePrice = basePrice + 10;
        } else if(age3 >= 18){
            basePrice = basePrice + 50;
        } else if(age3 >= 55){
            basePrice = basePrice +100;
        } else if(age3 == 0){
            JOptionPane.showMessageDialog(null, "Your final quote is " + basePrice);
        } else{
            JOptionPane.showMessageDialog(null, "There was an error. Please close this window and start over");
        } 

        int age4 = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of your third family member"));

        if(age4 <= 15){
            basePrice = basePrice + 10;
        } else if(age4 >= 18){
            basePrice = basePrice + 50;
        } else if(age4 >= 55){
            basePrice = basePrice +100;
        } else if(age4 == 0){
            JOptionPane.showMessageDialog(null, "Your final quote is " + basePrice);
        } else{
            JOptionPane.showMessageDialog(null, "There was an error. Please close this window and start over");
        }

        int age5 = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of your third family member"));

        if(age5 <= 15){
            basePrice = basePrice + 10;
        } else if(age5 >= 18){
            basePrice = basePrice + 50;
        } else if(age5 >= 55){
            basePrice = basePrice +100;
        } else if(age5 == 0){
            JOptionPane.showMessageDialog(null, "Your final quote is " + basePrice);
        } else{
            JOptionPane.showMessageDialog(null, "There was an error. Please close this window and start over");
        }

        int age6 = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of your third family member"));

        if(age6 <= 15){
            basePrice = basePrice + 10;
        } else if(age6 >= 18){
            basePrice = basePrice + 50;
        } else if(age6 >= 55){
            basePrice = basePrice +100;
        } else if(age6 == 0){
            JOptionPane.showMessageDialog(null, "Your final quote is " + basePrice);
        } else{
            JOptionPane.showMessageDialog(null, "There was an error. Please close this window and start over");
        }

        JOptionPane.showMessageDialog(null, "Your final quote is " + basePrice);

    }
}
