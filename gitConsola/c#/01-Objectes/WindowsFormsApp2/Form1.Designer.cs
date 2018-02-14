namespace WindowsFormsApp2
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.LBEtiqueta = new System.Windows.Forms.Label();
            this.BSuma = new System.Windows.Forms.Button();
            this.TBNum1 = new System.Windows.Forms.TextBox();
            this.TBNum2 = new System.Windows.Forms.TextBox();
            this.BResta = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // LBEtiqueta
            // 
            this.LBEtiqueta.AutoSize = true;
            this.LBEtiqueta.Location = new System.Drawing.Point(183, 235);
            this.LBEtiqueta.Name = "LBEtiqueta";
            this.LBEtiqueta.Size = new System.Drawing.Size(0, 13);
            this.LBEtiqueta.TabIndex = 0;
            // 
            // BSuma
            // 
            this.BSuma.Location = new System.Drawing.Point(129, 318);
            this.BSuma.Name = "BSuma";
            this.BSuma.Size = new System.Drawing.Size(75, 23);
            this.BSuma.TabIndex = 1;
            this.BSuma.Text = "+";
            this.BSuma.UseVisualStyleBackColor = true;
            this.BSuma.Click += new System.EventHandler(this.BSuma_Click);
            // 
            // TBNum1
            // 
            this.TBNum1.Location = new System.Drawing.Point(104, 191);
            this.TBNum1.Name = "TBNum1";
            this.TBNum1.Size = new System.Drawing.Size(100, 20);
            this.TBNum1.TabIndex = 2;
            // 
            // TBNum2
            // 
            this.TBNum2.Location = new System.Drawing.Point(252, 191);
            this.TBNum2.Name = "TBNum2";
            this.TBNum2.Size = new System.Drawing.Size(100, 20);
            this.TBNum2.TabIndex = 3;
            // 
            // BResta
            // 
            this.BResta.Location = new System.Drawing.Point(277, 318);
            this.BResta.Name = "BResta";
            this.BResta.Size = new System.Drawing.Size(75, 23);
            this.BResta.TabIndex = 4;
            this.BResta.Text = "-";
            this.BResta.UseVisualStyleBackColor = true;
            this.BResta.Click += new System.EventHandler(this.BResta_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(513, 401);
            this.Controls.Add(this.BResta);
            this.Controls.Add(this.TBNum2);
            this.Controls.Add(this.TBNum1);
            this.Controls.Add(this.BSuma);
            this.Controls.Add(this.LBEtiqueta);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label LBEtiqueta;
        private System.Windows.Forms.Button BSuma;
        private System.Windows.Forms.TextBox TBNum1;
        private System.Windows.Forms.TextBox TBNum2;
        private System.Windows.Forms.Button BResta;
    }
}

