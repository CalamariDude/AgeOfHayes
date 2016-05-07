import java.applet.Applet; import java.awt.*; import java.awt.event.MouseEvent; import java.io.IOException; import java.util.Scanner; import javax.swing.JFrame; import javax.swing.JPanel; import javax.swing.*; public class AgeOfWar { public static void main(String[] args) throws InterruptedException { JFrame frame = new JFrame("Age of Hayes"); /*	frame.update(Graphics g);*/ AOWRunner game = null; try { game = new AOWRunner(); } catch (IOException e) { e.printStackTrace(); } /*	frame.setIconImage(Image b); AOWRunner game = new AOWRunner();*/ frame.add(game); frame.setSize(1920, 1080); frame.setVisible(true); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); JButton Play = new JButton("Play"); JLabel Title = new JLabel("Age of War"); JPanel titlePanel = new JPanel(); titlePanel.add(Title); titlePanel.add(Play); Play.setOpaque(false); Play.setContentAreaFilled(false); frame.add(titlePanel); /* try { AOWRunner runner = new AOWRunner(); } catch (IOException e) { e.printStackTrace();
        }
*/
        AOWBase baseF = new AOWBase(500, 500, 25);
        AOWBase baseE = new AOWBase(500, 500, 1325);

        Scanner keyboard = new Scanner(System.in);

        AOWInfantry tempF;
        AOWInfantry tempE;

        while (baseF.getHealth() >= 0 && baseE.getHealth() >= 0)
        {
            //goes through the Infantries on field array list
            for(int i = 0; i < 10 ; i++)
            {
                //Checks if friendly infrantries on field
                if(i < AOWRunner.infantriesOFFriendly.size() )
                {
                    tempF = AOWRunner.infantriesOFFriendly.get(i);

                    if(AOWRunner.infantriesOFEnemy.size() > 0)
                    {
                        tempE = AOWRunner.infantriesOFEnemy.get(0);
                    }
                        if(i==0)
                        {

                            //check if possible to (attack) enemy
                            /if(tempF.getX() + tempF.getRange() > tempE.getX())
                            {
                               //tempF.attack();
                            }

                            //check if possible to (attack) base
                            else if (tempF.getX() + tempF.range() > baseE.getX())
                            {
                                //tempF.attack();
                            }

                            //check if possible to (move)
                            else if (tempE != null)
                            {
                                if (tempF.getX() + 5 >= tempE.getX()) {
                                    tempF.move();

                                }
                            }






                        }


                        if(i!=0)
                        {
                            if( AOWRunner.infantriesOFFriendly.get(i-1).getX() - tempF.getX() > 10)
                            {
                                tempF.move();
                            }

                            else if (tempF.getRange() + tempF.getX() > AOWRunner.infantriesOFEnemy.get(0).getX())
                            {
                                //tempF.attack();
                            }
                        }
                    }




                }
                //checks enemy infrantry on field
                if(i < AOWRunner.infantriesOFEnemy.size() ){

                    tempE = AOWRunner.infantriesOFEnemy.get(i);
                    if(i==0) {
                        if (i < AOWRunner.infantriesOFFriendly.size()) {
                            tempF = AOWRunner.infantriesOFFriendly.get(0);
                            if (tempE.getX()-5 <= tempF.getX()) {
                                AOWRunner.infantriesOFEnemy.get(i).moveE();


                            }
                        }
                        //if attack
                        else if()
                    }

                }



                //checks to see if the first infantry unit
                if(i == 0){



                }
            }

            game.move();
            game.repaint();

            Thread.sleep(1000);

        }


    }

}