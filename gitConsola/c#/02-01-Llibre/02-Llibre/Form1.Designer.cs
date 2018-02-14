namespace _02_Llibre
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
            this.LBText = new System.Windows.Forms.Label();
            this.BEnrere = new System.Windows.Forms.Button();
            this.LBpagines = new System.Windows.Forms.Label();
            this.LBDimensio = new System.Windows.Forms.Label();
            this.LBAutor = new System.Windows.Forms.Label();
            this.LBColor = new System.Windows.Forms.Label();
            this.LBAny = new System.Windows.Forms.Label();
            this.LBContingut = new System.Windows.Forms.Label();
            this.BAvant = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // LBText
            // 
            this.LBText.AutoSize = true;
            this.LBText.Location = new System.Drawing.Point(22, 35);
            this.LBText.Name = "LBText";
            this.LBText.Size = new System.Drawing.Size(0, 13);
            this.LBText.TabIndex = 0;
            // 
            // BEnrere
            // 
            this.BEnrere.Location = new System.Drawing.Point(25, 292);
            this.BEnrere.Name = "BEnrere";
            this.BEnrere.Size = new System.Drawing.Size(75, 23);
            this.BEnrere.TabIndex = 1;
            this.BEnrere.Text = "<";
            this.BEnrere.UseVisualStyleBackColor = true;
            this.BEnrere.Click += new System.EventHandler(this.BEnrere_Click);
            // 
            // LBpagines
            // 
            this.LBpagines.AutoSize = true;
            this.LBpagines.Location = new System.Drawing.Point(22, 60);
            this.LBpagines.Name = "LBpagines";
            this.LBpagines.Size = new System.Drawing.Size(0, 13);
            this.LBpagines.TabIndex = 2;
            // 
            // LBDimensio
            // 
            this.LBDimensio.AutoSize = true;
            this.LBDimensio.Location = new System.Drawing.Point(22, 86);
            this.LBDimensio.Name = "LBDimensio";
            this.LBDimensio.Size = new System.Drawing.Size(0, 13);
            this.LBDimensio.TabIndex = 3;
            // 
            // LBAutor
            // 
            this.LBAutor.AutoSize = true;
            this.LBAutor.Location = new System.Drawing.Point(22, 114);
            this.LBAutor.Name = "LBAutor";
            this.LBAutor.Size = new System.Drawing.Size(0, 13);
            this.LBAutor.TabIndex = 4;
            // 
            // LBColor
            // 
            this.LBColor.AutoSize = true;
            this.LBColor.Location = new System.Drawing.Point(22, 141);
            this.LBColor.Name = "LBColor";
            this.LBColor.Size = new System.Drawing.Size(0, 13);
            this.LBColor.TabIndex = 5;
            // 
            // LBAny
            // 
            this.LBAny.AutoSize = true;
            this.LBAny.Location = new System.Drawing.Point(22, 169);
            this.LBAny.Name = "LBAny";
            this.LBAny.Size = new System.Drawing.Size(0, 13);
            this.LBAny.TabIndex = 6;
            // 
            // LBContingut
            // 
            this.LBContingut.AutoSize = true;
            this.LBContingut.Location = new System.Drawing.Point(22, 224);
            this.LBContingut.Name = "LBContingut";
            this.LBContingut.Size = new System.Drawing.Size(0, 13);
            this.LBContingut.TabIndex = 7;
            // 
            // BAvant
            // 
            this.BAvant.Location = new System.Drawing.Point(133, 292);
            this.BAvant.Name = "BAvant";
            this.BAvant.Size = new System.Drawing.Size(75, 23);
            this.BAvant.TabIndex = 8;
            this.BAvant.Text = ">";
            this.BAvant.UseVisualStyleBackColor = true;
            this.BAvant.Click += new System.EventHandler(this.BAvant_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 327);
            this.Controls.Add(this.BAvant);
            this.Controls.Add(this.LBContingut);
            this.Controls.Add(this.LBAny);
            this.Controls.Add(this.LBColor);
            this.Controls.Add(this.LBAutor);
            this.Controls.Add(this.LBDimensio);
            this.Controls.Add(this.LBpagines);
            this.Controls.Add(this.BEnrere);
            this.Controls.Add(this.LBText);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label LBText;
        private System.Windows.Forms.Button BEnrere;
        private System.Windows.Forms.Label LBpagines;
        private System.Windows.Forms.Label LBDimensio;
        private System.Windows.Forms.Label LBAutor;
        private System.Windows.Forms.Label LBColor;
        private System.Windows.Forms.Label LBAny;
        private System.Windows.Forms.Label LBContingut;
        private System.Windows.Forms.Button BAvant;
    }
}

