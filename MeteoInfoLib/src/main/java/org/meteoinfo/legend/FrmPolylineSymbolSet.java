 /* Copyright 2012 Yaqiang Wang,
 * yaqiang.wang@gmail.com
 * 
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
 * General Public License for more details.
 */
package org.meteoinfo.legend;

import org.meteoinfo.global.event.ISelectedCellChangedListener;
import org.meteoinfo.global.event.SelectedCellChangedEvent;
import org.meteoinfo.layout.MapLayout;
import org.meteoinfo.map.MapView;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JColorChooser;

/**
 *
 * @author Yaqiang Wang
 */
public class FrmPolylineSymbolSet extends javax.swing.JDialog {

    private Object _parent = null;
    private PolylineBreak _polylineBreak = null;
    private boolean isLoading = false;

    /**
     * Creates new form FrmPolylineSymbolSet
     * @param parent
     * @param modal
     */
    public FrmPolylineSymbolSet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setTitle("Polyline Symbol Set");
    }

    /**
     * Creates new form FrmPolylineSymbolSet
     * @param parent
     * @param modal
     * @param tparent
     */
    public FrmPolylineSymbolSet(java.awt.Dialog parent, boolean modal, Object tparent) {
        super(parent, modal);
        initComponents();
        
        this.setTitle("Polyline Symbol Set");
        if (tparent.getClass() == LegendView.class){
            this.jButton_Apply.setVisible(false);
            this.jButton_OK.setVisible(false);
            this.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - 40));
        }

        this.symbolControl1.addSelectedCellChangedListener(new ISelectedCellChangedListener() {
            @Override
            public void selectedCellChangedEvent(SelectedCellChangedEvent event) {
                onSelectedCellChanged(event);
            }
        });

        this._parent = tparent;
    }
    
    /**
     * Creates new form FrmPolylineSymbolSet
     * @param parent
     * @param modal
     * @param tparent
     */
    public FrmPolylineSymbolSet(java.awt.Frame parent, boolean modal, Object tparent) {
        super(parent, modal);
        initComponents();
        
        this.setTitle("Polyline Symbol Set");
        if (tparent.getClass() == LegendView.class){
            this.jButton_Apply.setVisible(false);
            this.jButton_OK.setVisible(false);
            this.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - 40));
        }

        this.symbolControl1.addSelectedCellChangedListener(new ISelectedCellChangedListener() {
            @Override
            public void selectedCellChangedEvent(SelectedCellChangedEvent event) {
                onSelectedCellChanged(event);
            }
        });

        this._parent = tparent;
    }

    private void onSelectedCellChanged(SelectedCellChangedEvent event) {
        if (isLoading) {
            return;
        }

        _polylineBreak.setStyle(LineStyles.values()[symbolControl1.getSelectedCell()]);
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_PolylineStyle(_polylineBreak.getStyle());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        symbolControl1 = new org.meteoinfo.legend.SymbolControl();
        jLabel1 = new javax.swing.JLabel();
        jSpinner_Size = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Color = new javax.swing.JLabel();
        jCheckBox_DrawShape = new javax.swing.JCheckBox();
        jCheckBox_DrawPointSymbol = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner_SymbolSize = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel_SymbolColor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner_SymbolInterval = new javax.swing.JSpinner();
        jComboBox_SymbolStyle = new javax.swing.JComboBox();
        jCheckBox_DrawFill = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel_FillColor = new javax.swing.JLabel();
        jButton_Apply = new javax.swing.JButton();
        jButton_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        symbolControl1.setCellSize(new java.awt.Dimension(50, 40));
        symbolControl1.setPreferredSize(new java.awt.Dimension(200, 50));
        symbolControl1.setShapeType(org.meteoinfo.shape.ShapeTypes.Polyline);

        jLabel1.setText("Size:");

        jSpinner_Size.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(100.0f), Float.valueOf(0.5f)));
        jSpinner_Size.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_SizeStateChanged(evt);
            }
        });

        jLabel2.setText("Color:");

        jLabel_Color.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel_Color.setOpaque(true);
        jLabel_Color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ColorMouseClicked(evt);
            }
        });

        jCheckBox_DrawShape.setText("Draw Shape");
        jCheckBox_DrawShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DrawShapeActionPerformed(evt);
            }
        });

        jCheckBox_DrawPointSymbol.setText("Draw Point Symbol");
        jCheckBox_DrawPointSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DrawPointSymbolActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Point Symbol"));
        jPanel1.setToolTipText("Outline");
        jPanel1.setName("Outline"); // NOI18N

        jLabel3.setText("Size:");

        jSpinner_SymbolSize.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(100.0f), Float.valueOf(0.5f)));
        jSpinner_SymbolSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_SymbolSizeStateChanged(evt);
            }
        });

        jLabel4.setText("Outline Color:");

        jLabel_SymbolColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel_SymbolColor.setOpaque(true);
        jLabel_SymbolColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SymbolColorMouseClicked(evt);
            }
        });

        jLabel5.setText("Interval:");

        jSpinner_SymbolInterval.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jSpinner_SymbolInterval.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner_SymbolIntervalStateChanged(evt);
            }
        });

        jComboBox_SymbolStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_SymbolStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SymbolStyleActionPerformed(evt);
            }
        });

        jCheckBox_DrawFill.setText("Draw Fill");
        jCheckBox_DrawFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DrawFillActionPerformed(evt);
            }
        });

        jLabel6.setText("Fill Color:");

        jLabel_FillColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel_FillColor.setOpaque(true);
        jLabel_FillColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_FillColorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_SymbolStyle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_SymbolSize, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox_DrawFill)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner_SymbolInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_SymbolColor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_FillColor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_SymbolColor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jSpinner_SymbolSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox_DrawFill)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_FillColor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner_SymbolInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_SymbolStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton_Apply.setText("Apply");
        jButton_Apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApplyActionPerformed(evt);
            }
        });

        jButton_OK.setText("OK");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(symbolControl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox_DrawShape))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox_DrawPointSymbol))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton_Apply, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(symbolControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner_Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox_DrawShape))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox_DrawPointSymbol)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Apply)
                    .addComponent(jButton_OK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner_SizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_SizeStateChanged
        // TODO add your handling code here:
        float size = Float.parseFloat(this.jSpinner_Size.getValue().toString());
        _polylineBreak.setWidth(size);
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_Size(size);
        }
    }//GEN-LAST:event_jSpinner_SizeStateChanged

    private void jLabel_ColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ColorMouseClicked
        // TODO add your handling code here:
        Color aColor = JColorChooser.showDialog(rootPane, null, this.jLabel_Color.getBackground());
        this.jLabel_Color.setBackground(aColor);
        _polylineBreak.setColor(aColor);
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_Color(aColor);
        }
    }//GEN-LAST:event_jLabel_ColorMouseClicked

    private void jCheckBox_DrawShapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DrawShapeActionPerformed
        // TODO add your handling code here:
        _polylineBreak.setDrawShape(this.jCheckBox_DrawShape.isSelected());
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_DrawShape(this.jCheckBox_DrawShape.isSelected());
        }
    }//GEN-LAST:event_jCheckBox_DrawShapeActionPerformed

    private void jCheckBox_DrawPointSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DrawPointSymbolActionPerformed
        // TODO add your handling code here:
        _polylineBreak.setDrawSymbol(this.jCheckBox_DrawPointSymbol.isSelected());
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_DrawSymbol(this.jCheckBox_DrawPointSymbol.isSelected());
        }
    }//GEN-LAST:event_jCheckBox_DrawPointSymbolActionPerformed

    private void jSpinner_SymbolSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_SymbolSizeStateChanged
        // TODO add your handling code here:
        float size = Float.parseFloat(this.jSpinner_SymbolSize.getValue().toString());
        _polylineBreak.setSymbolSize(size);
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_SymbolSize(size);
        }
    }//GEN-LAST:event_jSpinner_SymbolSizeStateChanged

    private void jLabel_SymbolColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SymbolColorMouseClicked
        // TODO add your handling code here:
        Color aColor = JColorChooser.showDialog(rootPane, null, this.jLabel_SymbolColor.getBackground());
        this.jLabel_SymbolColor.setBackground(aColor);
        _polylineBreak.setSymbolColor(aColor);
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_SymbolColor(aColor);
        }
    }//GEN-LAST:event_jLabel_SymbolColorMouseClicked

    private void jSpinner_SymbolIntervalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner_SymbolIntervalStateChanged
        // TODO add your handling code here:
        int interval = Integer.parseInt(this.jSpinner_SymbolInterval.getValue().toString());
        _polylineBreak.setSymbolInterval(interval);
        if (_parent.getClass() == LegendView.class) {
            ((LegendView) _parent).setLegendBreak_SymbolInterval(interval);
        }
    }//GEN-LAST:event_jSpinner_SymbolIntervalStateChanged

    private void jComboBox_SymbolStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SymbolStyleActionPerformed
        // TODO add your handling code here:
        if (isLoading){
            return;
        }
        
        _polylineBreak.setSymbolStyle(PointStyle.valueOf(this.jComboBox_SymbolStyle.getSelectedItem().toString()));
            if (_parent.getClass() == LegendView.class) {
            ((LegendView)_parent).setLegendBreak_SymbolStyle(_polylineBreak.getSymbolStyle());
        }
    }//GEN-LAST:event_jComboBox_SymbolStyleActionPerformed

    private void jButton_ApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApplyActionPerformed
        // TODO add your handling code here:
        if (_parent.getClass() == MapView.class) {
            ((MapView) _parent).paintLayers();
        } else if (_parent.getClass() == MapLayout.class) {
            ((MapLayout) _parent).paintGraphics();
        }
    }//GEN-LAST:event_jButton_ApplyActionPerformed

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        if (_parent.getClass() == MapView.class) {
            ((MapView) _parent).setDefPolylineBreak(_polylineBreak);
            ((MapView) _parent).paintLayers();
        } else if (_parent.getClass() == MapLayout.class) {
            ((MapLayout) _parent).setDefPolylineBreak(_polylineBreak);
            ((MapLayout) _parent).paintGraphics();
        }

        this.dispose();
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jCheckBox_DrawFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DrawFillActionPerformed
        // TODO add your handling code here:
        _polylineBreak.setFillSymbol(this.jCheckBox_DrawFill.isSelected());
        if (_parent.getClass() == LegendView.class) {
            //((LegendView) _parent).setLegendBreak_DrawFill(this.jCheckBox_DrawFill.isSelected());
            ((LegendView) _parent).repaint();
        }
    }//GEN-LAST:event_jCheckBox_DrawFillActionPerformed

    private void jLabel_FillColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_FillColorMouseClicked
        // TODO add your handling code here:
        Color c = JColorChooser.showDialog(rootPane, null, this.jLabel_FillColor.getBackground());
        if (c == null)
            return;
        
        Color aColor = new Color(c.getRed(), c.getGreen(), c.getBlue());
        this.jLabel_FillColor.setBackground(aColor);
        _polylineBreak.setSymbolFillColor(aColor);
        if (_parent.getClass() == LegendView.class) {
            //((LegendView) _parent).setLegendBreak_Color(aColor);
            ((LegendView) _parent).repaint();
        }
    }//GEN-LAST:event_jLabel_FillColorMouseClicked

    /**
     * Set polyline break
     *
     * @param plb The polyline break
     */
    public void setPolylineBreak(PolylineBreak plb) {
        _polylineBreak = plb;
        updateProperties();
    }

    private void updateProperties() {
        isLoading = true;

        this.jLabel_Color.setBackground(_polylineBreak.getColor());
        this.jSpinner_Size.setValue(_polylineBreak.getWidth());
        this.jCheckBox_DrawShape.setSelected(_polylineBreak.isDrawShape());
        this.jCheckBox_DrawPointSymbol.setSelected(_polylineBreak.getDrawSymbol());
        this.jSpinner_SymbolSize.setValue(_polylineBreak.getSymbolSize());
        this.jLabel_SymbolColor.setBackground(_polylineBreak.getSymbolColor());
        this.jSpinner_SymbolInterval.setValue(_polylineBreak.getSymbolInterval());
        this.jComboBox_SymbolStyle.removeAllItems();
        for (PointStyle sName : PointStyle.values()) {
            this.jComboBox_SymbolStyle.addItem(sName);
        }
        this.jComboBox_SymbolStyle.setSelectedItem(_polylineBreak.getSymbolStyle());
        this.jCheckBox_DrawFill.setSelected(_polylineBreak.isFillSymbol());
        this.jLabel_FillColor.setBackground(_polylineBreak.getSymbolFillColor());

        //symbolControl1.setSymbolNumber(LineStyles.values().length);
        if (_parent.getClass() == LegendView.class) {
            symbolControl1.setSymbolNumber(5);
        } else {
            symbolControl1.setSymbolNumber(LineStyles.values().length);
        }

        symbolControl1.setSelectedCell(Arrays.asList(LineStyles.values()).indexOf(_polylineBreak.getStyle()));
        
        isLoading = false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPolylineSymbolSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPolylineSymbolSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPolylineSymbolSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPolylineSymbolSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPolylineSymbolSet dialog = new FrmPolylineSymbolSet(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Apply;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JCheckBox jCheckBox_DrawFill;
    private javax.swing.JCheckBox jCheckBox_DrawPointSymbol;
    private javax.swing.JCheckBox jCheckBox_DrawShape;
    private javax.swing.JComboBox jComboBox_SymbolStyle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_FillColor;
    private javax.swing.JLabel jLabel_SymbolColor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner_Size;
    private javax.swing.JSpinner jSpinner_SymbolInterval;
    private javax.swing.JSpinner jSpinner_SymbolSize;
    private org.meteoinfo.legend.SymbolControl symbolControl1;
    // End of variables declaration//GEN-END:variables
}
