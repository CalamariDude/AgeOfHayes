import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;

public class AgeOfWar

{
    public static void main(String[] args) throws InterruptedException, IOException  {
        JFrame frame = new JFrame("Age of Hayes");
        /*	frame.update(Graphics g);*/


        AOWRunner game = null;

        try { game = new AOWRunner(); }
        catch (IOException e) { e.printStackTrace(); }

        /*	frame.setIconImage(Image b);
        AOWRunner game = new AOWRunner();*/

        frame.add(game);
        frame.setSize(1300, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        String xp = "" + AOWRunner.baseF.getXP();
        String gold = "" + AOWRunner.baseF.getMoney();

        JLabel title = new JLabel(xp);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        frame.add(title);







        // Create a "clickable" image icon.
        /*
        ImageIcon AOWMelee = new ImageIcon("Resources\\Main Menu\\AOWMelee.jpg");
        ImageIcon AOWRanged = new ImageIcon("Resources\\Main Menu\\AOWRanged.jpg");
        ImageIcon AOWTank = new ImageIcon("Resources\\Main Menu\\AOWTank.jpg");
        */
        /*
        JLabel labelforMelee = new JLabel(AOWMelee);
        JLabel labelforRanged = new JLabel(AOWRanged);
        JLabel labelforTank = new JLabel(AOWTank);
        */
/*
        JButton meleeButton = new JButton(AOWMelee);
        JButton rangedButton = new JButton(AOWRanged);
        JButton tankButton = new JButton(AOWTank);
*/
/*
        meleeButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent me)
            {
                //game.create(1);
            }
        });

        rangedButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent me)
            {
                //game.create(2);
            }
        });

        tankButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent me)
            {
                //game.create(3);
            }
        });
*/
/*
        meleeButton.setLocation(0,1000);
        rangedButton.setLocation(50,1000);
        tankButton.setLocation(100,1000);
        */


        // JPanel attackPanel = new JPanel();

/*
        attackPanel.add(meleeButton);
        attackPanel.add(rangedButton);
        attackPanel.add(tankButton);
        attackPanel.setLocation(0,1000);
*/

        /*
        // Add it to a frame
        frame.getContentPane().add(labelforMelee);
        frame.getContentPane().add(labelforRanged);
        frame.getContentPane().add(labelforTank);
        */









/*
        JButton Play = new JButton("Play");
        JLabel Title = new JLabel("Age of War");
        JPanel titlePanel = new JPanel();
        titlePanel.add(Title);
        titlePanel.add(Play);
        Play.setOpaque(false);
        Play.setContentAreaFilled(false);
        frame.add(titlePanel);

        /* try { AOWRunner runner = new AOWRunner(); }
        catch (IOException e) { e.printStackTrace();


        }

*/

        Scanner keyboard = new Scanner(System.in);

        AOWInfantry tempF ;
        AOWInfantry tempE ;

        while (AOWRunner.baseF.getHealth() >= 0 && AOWRunner.baseE.getHealth() >= 0)
        {
            //goes through the Infantries on field array list
            //maximum of ten infantries per team
            for(int i = 0; i < 10 ; i++)
            {
                //Checks if friendly infantry is on field
                if(i < AOWRunner.infantriesOFFriendly.size() )
                {
                    tempF = AOWRunner.infantriesOFFriendly.get(i);


                    //Gets the percentage of health that the unit still has
                    //int decimalHealth = tempF.getHealth() / tempF.getSpawnHealth();

                    //drawRect(tempF.getX(), 200, 10, 30);

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


                                if(tempE.getHealth() <= 0)
                                {
                                    AOWRunner.baseF.setMoney(AOWRunner.baseF.getMoney() + tempE.getGoldGiver());
                                    AOWRunner.baseF.setXP(AOWRunner.baseF.getXP() + tempE.getXpGiver());

                                    AOWRunner.infantriesOFEnemy.remove(0);
                                }


                            }


                            else
                            {
                                tempF.move();
                            }

                        }// end of actions for first friendly infantry

                        //friendly infantries other than the first one
                        else
                        {
                            //determines whether to (move) based on distance between
                            //currently friendly infantry and friendly infantry in front
                            if( AOWRunner.infantriesOFFriendly.get(i-1).getX() - tempF.getX() > 50)
                            {
                                tempF.move();
                            }

                            //checks whether possible to (attack) enemy infantry
                            else if (tempF.getRange() + tempF.getX() > tempE.getX())
                            {
                                tempF.attack(tempE);

                                if(tempE.getHealth() <= 0)
                                {
                                    AOWRunner.baseF.setMoney(AOWRunner.baseF.getMoney() + tempE.getGoldGiver());
                                    AOWRunner.baseF.setXP(AOWRunner.baseF.getXP() + tempE.getXpGiver());

                                    AOWRunner.infantriesOFEnemy.remove(0);
                                }
                            }
                        }

                    } // end of if enemy is on field

                    //---------------------------------------------------------------------------

                    //first friendly infantry w/o enemy on field
                    else if(i == 0)
                    {
                        //check if possible to (attack) base
                        if (tempF.getX() + tempF.getRange() > AOWRunner.baseE.getX())
                        {
                            tempF.attack(AOWRunner.baseE);
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
                        if( AOWRunner.infantriesOFFriendly.get(i-1).getX() - tempF.getX() > 50)
                        {
                            tempF.move();
                        }

                        //check if possible to (attack) base
                        else if (tempF.getX() + tempF.getRange() > AOWRunner.baseE.getX())
                        {
                            tempF.attack(AOWRunner.baseE);
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

                                if(tempE.getHealth() <= 0)
                                {
                                    AOWRunner.baseE.setMoney(AOWRunner.baseE.getMoney() + tempF.getGoldGiver());
                                    AOWRunner.baseE.setXP(AOWRunner.baseE.getXP() + tempF.getXpGiver());

                                    AOWRunner.infantriesOFFriendly.remove(0);
                                }
                            }

                            else
                            {
                                tempF.moveE();
                            }

                        }// end of actions for first enemy infantry

                        //enemy infantries other than the first one with friendly infantry on field
                        else if(j != 0)
                        {
                            //determines whether to (move) based on distance between
                            //currently friendly infantry and friendly infantry in front
                            if( tempF.getX() - AOWRunner.infantriesOFEnemy.get(j-1).getX() > 50)
                            {
                                tempF.moveE();
                            }

                            //checks whether possible to (attack) friendly infantry
                            else if (tempF.getX() - tempF.getRange()  < tempE.getX())
                            {
                                tempF.attack(tempE);

                                if(tempE.getHealth() <= 0)
                                {
                                    AOWRunner.baseE.setMoney(AOWRunner.baseE.getMoney() + tempF.getGoldGiver());
                                    AOWRunner.baseE.setXP(AOWRunner.baseE.getXP() + tempF.getXpGiver());

                                    AOWRunner.infantriesOFFriendly.remove(0);
                                }
                            }
                        }

                    } // end of if friendly is on field

                    //---------------------------------------------------------------------------

                    //first enemy infantry w/o friendly on field
                    else if(j == 0)
                    {
                        //check if possible to (attack) base
                        if (tempF.getX() - tempF.getRange() < AOWRunner.baseF.getX())
                        {
                            tempF.attack(AOWRunner.baseF);
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
                        if(tempF.getX() - AOWRunner.infantriesOFEnemy.get(j-1).getX()  > 50)
                        {
                            tempF.moveE();
                        }

                        //check if possible to (attack) base
                        else if (tempF.getX() - tempF.getRange() < AOWRunner.baseF.getX())
                        {
                            tempF.attack(AOWRunner.baseF);
                        }

                    } // end of actions for infantries other than first

                } // end of performing actions for all friendly infantry


            } // end of loop through all friendly infantry




            //  AOWRunner.infantriesOFFriendly.get(0).move();

            // game.Create(1);

            AOWTurrets TurrF, TurrE;
            //loop through all posible turrets
            for(int i = 0; i <1; i++){


                //if the size of the TurretsOFFriendly array is this size
                if(AOWRunner.turretsOFFriendly.size()>i)
                {

                    //if there is a turret at this index
                    if (AOWRunner.turretsOFFriendly.get(i) != null)
                    {
                        TurrF = AOWRunner.turretsOFFriendly.get(i);


                        //if there is an enemy on the field
                        if (AOWRunner.infantriesOFEnemy.size() > 0)
                        {




                            //if that enemy is in range, attack
                            if (TurrF.getRange() + TurrF.getX() > AOWRunner.infantriesOFEnemy.get(0).getX())
                            {

                                TurrF.attack(AOWRunner.infantriesOFEnemy.get(0));if(AOWRunner.infantriesOFEnemy.get(0).getHealth() <= 0)
                                {
                                    AOWRunner.baseF.setMoney(AOWRunner.baseF.getMoney() + AOWRunner.infantriesOFEnemy.get(0).getGoldGiver());
                                    AOWRunner.baseF.setXP(AOWRunner.baseF.getXP() + AOWRunner.infantriesOFEnemy.get(0).getXpGiver());

                                    AOWRunner.infantriesOFEnemy.remove(0);
                                }


                            }
                            else
                                TurrF.rest();

                        }

                    }
                }

                //if the size of the TurretsOFEnemy array is this size
                if(AOWRunner.turretsOFEnemy.size()>i)
                {

                    //if there is a turret at this index
                    if (AOWRunner.turretsOFEnemy.get(i) != null)
                    {
                        TurrE = AOWRunner.turretsOFEnemy.get(i);

                        //if there is an Friendly on the field
                        if (AOWRunner.infantriesOFFriendly.size()>0)
                        {


                            //if that Friendly is in range, attack
                            if (TurrE.getX() - TurrE.getRange() < AOWRunner.infantriesOFFriendly.get(0).getX())
                            {
                                TurrE.attack(AOWRunner.infantriesOFFriendly.get(0));
                                if(AOWRunner.infantriesOFFriendly.get(0).getHealth() <= 0)
                                {
                                    AOWRunner.baseE.setMoney(AOWRunner.baseE.getMoney() + AOWRunner.infantriesOFFriendly.get(0).getGoldGiver());
                                    AOWRunner.baseE.setXP(AOWRunner.baseE.getXP() + AOWRunner.infantriesOFFriendly.get(0).getXpGiver());

                                    AOWRunner.infantriesOFFriendly.remove(0);
                                }
                            } else
                                TurrE.rest();

                        }

                    }

                }


            }













            game.repaint();

            Thread.sleep(100);

            //System.out.println(AOWRunner.infantriesOFFriendly.size());
            //System.out.println(AOWRunner.baseF.getTier());

        }// end of game while loop

        System.out.println("gameover");


    }

}