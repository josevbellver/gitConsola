using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Llibre
{
	public class Llibre
	{

		//////////////////////////////////////////
		// variables classe (propietats objectes)
		//////////////////////////////////////////

		// DE NORMAL LES PROPIETATS HAN DE SER PRIVATE
		// PER COMENÇAR AVUI, LES POSEM PUBLIC.

		private String titol;
		private int numeroPagines;
		private String dimensions;
		private String autor;
		private String ColorPortada;
		private int anyEdicio;
		private String contingutLlibre;

		//////////////////////////////////////////
		// mètodes classe (funcionalitat objectes)
		//////////////////////////////////////////


		public Llibre()
		{
		}

		public Llibre(String dimensions, int numeroPagines, int anyEdicio)
		{
			this.dimensions = dimensions;
			this.numeroPagines = numeroPagines;
			this.anyEdicio = anyEdicio;
		}

		public Llibre(String titol, int numpag, String dim, String aut, String ColorP, int anyEd, String contLlibre)
		{

			// constructor amb parÃ metres
			// per cada objecte que creem, tindran aquests valors entrats per parÃ metres.

			this.titol = titol; //amb la variable this, podem distingir titol de titol.
			this.numeroPagines = numpag;
			this.dimensions = dim;
			this.autor = aut;
			this.ColorPortada = ColorP;
			this.anyEdicio = anyEd;
			this.contingutLlibre = contLlibre;

		}


        // MÈTODES GET //
        public String getDimensions()
        {
            return this.dimensions;
        }



		//final constructor

		// ('')--,--,- //


		//


		/////////////////
		// MÈTODES GET //
		/////////////////
		//public String getTitol()
		//{
		//	return this.titol;
		//}
		//public int getNumeroPagines()
		//{
		//	return this.numeroPagines;
		//}
		//public String getDimensions()
		//{
		//	return this.dimensions;
		//}
		//public String getAutor()
		//{
		//	return this.autor;
		//}
		//public String getColorPortada()
		//{
		//	return this.ColorPortada;
		//}
		//public int getAnyEdicio()
		//{
		//	return this.anyEdicio;
		//}
		//public String getContingutLlibre()
		//{
		//	return this.contingutLlibre;
		//}



		public string Titol { get => titol; }
		public int NumeroPagines { get => numeroPagines;}
		public string Dimensions { get => dimensions;  }
		public string Autor { get => autor; }
		public string ColorPortada1 { get => ColorPortada; }
		public int AnyEdicio { get => anyEdicio;  }
		public string ContingutLlibre { get => contingutLlibre; }



	}
}
