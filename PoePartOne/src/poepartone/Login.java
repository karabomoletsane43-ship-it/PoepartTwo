/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartone;

/**
 *
 * @author Student
 */
public class Login extends Registration{
    
    //Login user 
  public boolean loginUser(String username,
                           String password) {
      
      return this.userName.equals(username) &&
              this.passWord.equals(password);
  }
  //Return Login message
  public String returnLoginStatus(boolean loginStatus) {
      
      if(loginStatus){
          String firstName = null;
          String lastName = null;
         return "Quick Chat";
      }
      return "Username or password is incorrect please try again, or register";
  }         
}