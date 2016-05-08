import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
public class AgeOfWar
{
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame("Age of Hayes");
        /*	frame.update(Graphics g);*/

        AOWRunner game = null;

        try { game = new AOWRunner(); }
        catch (IOException e) { e.printStackTrace(); }

        /*	frame.setIconImage(Image b);
        AOWRunner game = new AOWRunner();*/

        frame.add(game);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
        JButton Play = new JButton("Play");
        JLabel Title = new JLabel("Age of War");
        JPanel titlePanel = new JPanel();
        titlePanel.add(Title);
        titlePanel.add(Play);
        Play.setOpaque(false);
        Play.setContentAreaFilled(false);
        frame.add(titlePanel);
        */
        /* try { AOWRunner runner = new AOWRunner(); }
        catch (IOException e) { e.printStackTrace();


        }

*/
        AOWBase baseF = new AOWBase(500, 500, 25);
        AOWBase baseE = new AOWBase(500, 500, 1325);

        Scanner keyboard = new Scanner(System.in);

        AOWInfantry tempF ;
        AOWInfantry tempE ;

        while (baseF.getHealth() >= 0 && baseE.getHealth() >= 0)
        {
            //goes through the Infantries on field array list
            //maximum of ten infantries per team
            for(int i = 0; i < 10 ; i++)
            {
                //Checks if friendly infantry is on field
                if(i < AOWRunner.infantriesOFFriendly.size() )
                {
                    tempF = AOWRunner.infantriesOFFriendly.get(i);

                    //checks if enemy unit is on field
                    if(AOWRunner.infantriesOFEnemy.size() > 0)
                    {
                        tempE = AOWRunner.infantriesOFEnemy.get(0);


                        //first friendly infantry
                        if(i == 0)
                        {
                            //check if possible to (attack) enemy
                            if (tempF.getX() + tempF.getRange() > tempE.getX())
                            {
                                tempF.attack(tempE);
                            }

                            //check if possible to (move)
                            else if (tempF.getX() + 48 <= tempE.getX())
                            {
                                tempF.move();
                            }

                        }// end of actions for first friendly infantry

                        //friendly infantries other than the first one
                        if(AOWRunner.infantriesOFEnemy.size() == 0 && i != 0)
                        {
                            //determines whether to (move) based on distance between
                            //currently friendly infantry and friendly infantry in front
                            if( AOWRunner.infantriesOFFriendly.get(i-1).getX() - tempF.getX() > 10)
                            {
                                tempF.move();
                            }

                            //checks whether possible to (attack) enemy infantry
                            else if (tempF.getRange() + tempF.getX() > tempE.getX())
                            {
                                tempF.attack(tempE);
                            }
                        }

                    } // end of if enemy is on field

                    //---------------------------------------------------------------------------

                    //first friendly infantry w/o enemy on field
                    else if(i == 0)
                    {
                        //check if possible to (attack) base
                        if (tempF.getX() + tempF.getRange() > baseE.getX())
                        {
                            tempF.attack(baseE);
                        }

                        //will (move) if cannot perform any other action
                        else
                        {
                            tempF.move();
                        }

                    } // end of actions for first infantry

                    //friendly infantries other than first w/o enemy on field
                    else if(i != 0)
                    {
                        //determines whether to (move) based on distance between
                        //currently friendly infantry and friendly infantry in front
                        if( AOWRunner.infantriesOFFriendly.get(i-1).getX() - tempF.getX() > 10)
                        {
                            tempF.move();
                        }

                        //check if possible to (attack) base
                        else if (tempF.getX() + tempF.getRange() > baseE.getX())
                        {
                            tempF.attack(baseE);
                        }

                    } // end of actions for infantries other than first

                } // end of performing actions for all friendly infantry

            } // end of loop through all friendly infantry

            //TempF will now be the enemy's unit
            //TempE will now be the friendly unit
            //goes through the Infantries on field array list
            //maximum of ten infantries per team
            for(int j = 0; j < 10 ; j++)
            {
                //Checks if enemy infantry is on field
                if(j < AOWRunner.infantriesOFEnemy.size() )
                {
                    tempF = AOWRunner.infantriesOFEnemy.get(j);

                    //checks if friendly unit is on field
                    if(AOWRunner.infantriesOFFriendly.size() > 0)
                    {
                        tempE = AOWRunner.infantriesOFFriendly.get(0);


                        //first enemy infantry
                        if(j == 0)
                        {
                            //check if possible to (attack) friendly
                            if (tempF.getX() - tempF.getRange() < tempE.getX())
                            {
                                tempF.attack(tempE);
                            }

                            //check if possible to (move)
                            else if (tempF.getX() - 48 >= tempE.getX())
                            {
                                tempF.moveE();
                            }

                        }// end of actions for first enemy infantry

                        //enemy infantries other than the first one with friendly infantry on field
                        if(j != 0)
                        {
                            //determines whether to (move) based on distance between
                            //currently friendly infantry and friendly infantry in front
                            if( AOWRunner.infantriesOFEnemy.get(j-1).getX() - tempF.getX() > -10)
                            {
                                tempF.moveE();
                            }

                            //checks whether possible to (attack) friendly infantry
                            else if (tempF.getX() - tempF.getRange()  < tempE.getX())
                            {
                                tempF.attack(tempE);
                            }
                        }

                    } // end of if friendly is on field

                    //---------------------------------------------------------------------------

                    //first enemy infantry w/o friendly on field
                    else if(j == 0)
                    {
                        //check if possible to (attack) base
                        if (tempF.getX() - tempF.getRange() < baseE.getX())
                        {
                            tempF.attack(baseE);
                        }

                        //will (move) if cannot perform any other action
                        else
                        {
                            tempF.moveE();
                        }

                    } // end of actions for first infantry

                    //friendly infantries other than first w/o enemy on field
                    else if(j != 0)
                    {
                        //determines whether to (move) based on distance between
                        //currently enemy infantry and enemy infantry in front
                        if( AOWRunner.infantriesOFEnemy.get(j-1).getX() - tempF.getX() > -10)
                        {
                            tempF.moveE();
                        }

                        //check if possible to (attack) base
                        else if (tempF.getX() - tempF.getRange() < baseE.getX())
                        {
                            tempF.attack(baseE);
                        }

                    } // end of actions for infantries other than first

                } // end of performing actions for all friendly infantry


            } // end of loop through all friendly infantry




          //  AOWRunner.infantriesOFFriendly.get(0).move();

            game.repaint();

            Thread.sleep(200);

        }// end of game while loop


    }

}