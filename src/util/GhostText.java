package util;

import clientes.TelaClienteIncluir;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class GhostText implements FocusListener, DocumentListener, PropertyChangeListener
{
    private final JTextField textComp;
    private boolean isEmpty;
    private Color ghostColor;
    private Color foregroundColor;
    private final String ghostText;

    public GhostText(final JTextField textComp, String ghostText)
    {
        super();
        this.textComp = textComp;
        this.ghostText = ghostText;
        this.ghostColor = Color.LIGHT_GRAY;
        textComp.addFocusListener(this);
        registerListeners();
        updateState();
        if (!this.textComp.hasFocus())
        {
            focusLost(null);
        }
    }

    public void delete()
    {
        unregisterListeners();
        textComp.removeFocusListener(this);
    }

    private void registerListeners()
    {
        textComp.getDocument().addDocumentListener(this);
        textComp.addPropertyChangeListener("foreground", this);
    }

    private void unregisterListeners()
    {
        textComp.getDocument().removeDocumentListener(this);
        textComp.removePropertyChangeListener("foreground", this);
    }

    public Color getGhostColor()
    {
        return ghostColor;
    }

    public void setGhostColor(Color ghostColor)
    {
        this.ghostColor = ghostColor;
    }

    private void updateState()
    {
        isEmpty = textComp.getText().length() == 0;
        foregroundColor = textComp.getForeground();
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        if (isEmpty)
        {
            unregisterListeners();
            try
            {
                if (this.ghostText.equalsIgnoreCase("Apenas números")) 
                {
                    try
                    {
                        textComp.setText("");
                        textComp.setForeground(foregroundColor);
                        TelaClienteIncluir.campoCepIC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##.###-###")));
                    } 
                    catch (ParseException ex) 
                    {
                        Logger.getLogger(GhostText.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if (this.ghostText.equalsIgnoreCase("Apenas números (DDD + 8 dígitos) - Opcional")) 
                {
                    try
                    {
                        textComp.setText("");
                        textComp.setForeground(foregroundColor);
                        TelaClienteIncluir.campoTelefoneIC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##) ####-####")));
                    } 
                    catch (ParseException ex) 
                    {
                        Logger.getLogger(GhostText.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                textComp.setText("");
                textComp.setForeground(foregroundColor);
            }
            finally
            {
                registerListeners();
            }
        }
        else
        {
            unregisterListeners();
            try
            {
                if (this.ghostText.equalsIgnoreCase("Apenas números") && textComp.getText().equalsIgnoreCase(ghostText)) 
                {
                    try
                    {
                        textComp.setText("");
                        textComp.setForeground(foregroundColor);
                        TelaClienteIncluir.campoCepIC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##.###-###")));
                    } 
                    catch (ParseException ex) 
                    {
                        Logger.getLogger(GhostText.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if (this.ghostText.equalsIgnoreCase("Apenas números (DDD + 8 dígitos) - Opcional") && textComp.getText().equalsIgnoreCase(ghostText))
                {
                    try
                    {
                        textComp.setText("");
                        textComp.setForeground(foregroundColor);
                        TelaClienteIncluir.campoTelefoneIC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##) ####-####")));
                    } 
                    catch (ParseException ex) 
                    {
                        Logger.getLogger(GhostText.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                textComp.setText("");
                textComp.setForeground(foregroundColor);
            }
            finally
            {
                registerListeners();
            }
        }

    }

    @Override
    public void focusLost(FocusEvent e)
    {
        if (isEmpty)
        {
            unregisterListeners();
            try
            {
                if (this.ghostText.equalsIgnoreCase("Apenas números")) 
                {
                    TelaClienteIncluir.campoCepIC.setFormatterFactory(null);
                }
                else if (this.ghostText.equalsIgnoreCase("Apenas números (DDD + 8 dígitos) - Opcional")) 
                {
                    TelaClienteIncluir.campoTelefoneIC.setFormatterFactory(null);
                }
                textComp.setText(ghostText);
                textComp.setForeground(ghostColor);
            }
            finally
            {
                registerListeners();
            }
        }
        else 
        { 
            unregisterListeners(); 
            try 
            {
                if (this.ghostText.equalsIgnoreCase("Apenas números") && textComp.getText().equals("  .   -   ")) 
                {
                    TelaClienteIncluir.campoCepIC.setFormatterFactory(null);                    
                    textComp.setForeground(ghostColor);
                    textComp.setText(ghostText);
                }
                else if (this.ghostText.equalsIgnoreCase("Apenas números (DDD + 8 dígitos) - Opcional") && textComp.getText().equals("(  )     -    ")) 
                {
                    TelaClienteIncluir.campoTelefoneIC.setFormatterFactory(null);                    
                    textComp.setForeground(ghostColor);
                    textComp.setText(ghostText);
                }                   
                else if (textComp.getText().equals(""))
                { 
                    textComp.setText(ghostText);
                    textComp.setForeground(ghostColor);
                }
                else
                {
                    textComp.setForeground(foregroundColor); 
                }
            } 
            finally
            { 
                registerListeners(); 
            } 
        } 
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        updateState();
    }

    @Override
    public void changedUpdate(DocumentEvent e)
    {
        updateState();
    }

    @Override
    public void insertUpdate(DocumentEvent e)
    {
        updateState();
    }

    @Override
    public void removeUpdate(DocumentEvent e)
    {
        updateState();
    }

}