//======================================================
// Source code generated by jvider v1.8.1 UNREGISTERED version.
// http://www.jvider.com/
//======================================================
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
/**
 * @author  Administrator
 * @created March 8, 2021
 */
public class MIFID extends JFrame 
{
static MIFID theMIFID;

JPanel pnPanel0;

JPanel pnPanel1;
JLabel lbLabel0;
JLabel lbLabel2;
JLabel lbLabel3;
JLabel lbLabel4;
JLabel lbLabel5;
JLabel lbLabel6;
JLabel lbLabel9;
/**
 */
public static void main( String args[] ) 
{
   try 
   {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
   }
   catch ( ClassNotFoundException e ) 
   {
   }
   catch ( InstantiationException e ) 
   {
   }
   catch ( IllegalAccessException e ) 
   {
   }
   catch ( UnsupportedLookAndFeelException e ) 
   {
   }
   theMIFID = new MIFID();
} 

/**
 */
public MIFID() 
{
   super( "TITLE" );

   pnPanel0 = new JPanel();
   GridBagLayout gbPanel0 = new GridBagLayout();
   GridBagConstraints gbcPanel0 = new GridBagConstraints();
   pnPanel0.setLayout( gbPanel0 );

   pnPanel1 = new JPanel();
   GridBagLayout gbPanel1 = new GridBagLayout();
   GridBagConstraints gbcPanel1 = new GridBagConstraints();
   pnPanel1.setLayout( gbPanel1 );

   lbLabel0 = new JLabel( "Nosaukums"  );
   gbcPanel1.gridx = 0;
   gbcPanel1.gridy = 0;
   gbcPanel1.gridwidth = 8;
   gbcPanel1.gridheight = 2;
   gbcPanel1.fill = GridBagConstraints.BOTH;
   gbcPanel1.weightx = 1;
   gbcPanel1.weighty = 1;
   gbcPanel1.anchor = GridBagConstraints.NORTH;
   gbPanel1.setConstraints( lbLabel0, gbcPanel1 );
   pnPanel1.add( lbLabel0 );

   lbLabel2 = new JLabel( "Re?istr?cijas numurs"  );
   gbcPanel1.gridx = 0;
   gbcPanel1.gridy = 2;
   gbcPanel1.gridwidth = 8;
   gbcPanel1.gridheight = 2;
   gbcPanel1.fill = GridBagConstraints.BOTH;
   gbcPanel1.weightx = 1;
   gbcPanel1.weighty = 1;
   gbcPanel1.anchor = GridBagConstraints.NORTH;
   gbPanel1.setConstraints( lbLabel2, gbcPanel1 );
   pnPanel1.add( lbLabel2 );

   lbLabel3 = new JLabel( "Re?istr?cijas valsts "  );
   gbcPanel1.gridx = 0;
   gbcPanel1.gridy = 4;
   gbcPanel1.gridwidth = 8;
   gbcPanel1.gridheight = 1;
   gbcPanel1.fill = GridBagConstraints.BOTH;
   gbcPanel1.weightx = 1;
   gbcPanel1.weighty = 1;
   gbcPanel1.anchor = GridBagConstraints.NORTH;
   gbPanel1.setConstraints( lbLabel3, gbcPanel1 );
   pnPanel1.add( lbLabel3 );

   lbLabel4 = new JLabel( "Klienta P?rst?vis"  );
   gbcPanel1.gridx = 0;
   gbcPanel1.gridy = 5;
   gbcPanel1.gridwidth = 8;
   gbcPanel1.gridheight = 1;
   gbcPanel1.fill = GridBagConstraints.BOTH;
   gbcPanel1.weightx = 1;
   gbcPanel1.weighty = 1;
   gbcPanel1.anchor = GridBagConstraints.NORTH;
   gbPanel1.setConstraints( lbLabel4, gbcPanel1 );
   pnPanel1.add( lbLabel4 );

   lbLabel5 = new JLabel( "Klienta P?rst?vja personas kods"  );
   gbcPanel1.gridx = 0;
   gbcPanel1.gridy = 6;
   gbcPanel1.gridwidth = 8;
   gbcPanel1.gridheight = 1;
   gbcPanel1.fill = GridBagConstraints.BOTH;
   gbcPanel1.weightx = 1;
   gbcPanel1.weighty = 1;
   gbcPanel1.anchor = GridBagConstraints.NORTH;
   gbPanel1.setConstraints( lbLabel5, gbcPanel1 );
   pnPanel1.add( lbLabel5 );

   lbLabel6 = new JLabel( "P?rst?v?bas pamats"  );
   gbcPanel1.gridx = 0;
   gbcPanel1.gridy = 7;
   gbcPanel1.gridwidth = 8;
   gbcPanel1.gridheight = 1;
   gbcPanel1.fill = GridBagConstraints.BOTH;
   gbcPanel1.weightx = 1;
   gbcPanel1.weighty = 1;
   gbcPanel1.anchor = GridBagConstraints.NORTH;
   gbPanel1.setConstraints( lbLabel6, gbcPanel1 );
   pnPanel1.add( lbLabel6 );

   lbLabel9 = new JLabel( " uz??muma pa�u kapit?ls ir liel?ks par 2 miljoniem EUR"  );
   gbcPanel1.gridx = 0;
   gbcPanel1.gridy = 10;
   gbcPanel1.gridwidth = 8;
   gbcPanel1.gridheight = 2;
   gbcPanel1.fill = GridBagConstraints.BOTH;
   gbcPanel1.weightx = 1;
   gbcPanel1.weighty = 1;
   gbcPanel1.anchor = GridBagConstraints.NORTH;
   gbPanel1.setConstraints( lbLabel9, gbcPanel1 );
   pnPanel1.add( lbLabel9 );
   gbcPanel0.gridx = 0;
   gbcPanel0.gridy = 0;
   gbcPanel0.gridwidth = 20;
   gbcPanel0.gridheight = 20;
   gbcPanel0.fill = GridBagConstraints.BOTH;
   gbcPanel0.weightx = 1;
   gbcPanel0.weighty = 0;
   gbcPanel0.anchor = GridBagConstraints.NORTH;
   gbPanel0.setConstraints( pnPanel1, gbcPanel0 );
   pnPanel0.add( pnPanel1 );

   setDefaultCloseOperation( EXIT_ON_CLOSE );

   setContentPane( pnPanel0 );
   pack();
   setVisible( true );
} 
} 
