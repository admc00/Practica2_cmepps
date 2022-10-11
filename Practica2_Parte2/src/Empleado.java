
public class Empleado {
	public float calculoNominaBruta(String TipoEmpleado , float ventasMes, float horasExtra) {
		int salarioBase;
		float salario=0;
		if(TipoEmpleado=="Vendedor") {
			salarioBase=2000;
			salario = salarioBase;
			if(ventasMes >= 1000) {
				salario+=100;
				if(ventasMes >=1500) {
					salario+=100;
				}
			}
			salario=salario + 30*horasExtra;
		}else if(TipoEmpleado=="Encargado") {
			salarioBase=2500;
		    salario = salarioBase;
			if(ventasMes >= 1000) {
				salario+=100;
				if(ventasMes >=1500) {
					salario+=100;
				}
			}
			salario=salario + 30*horasExtra;
		}
		return salario;
	}
	public float calculoNominaNeta(float nominaBruta) {
		float retencion=0;
		if( nominaBruta>1100 & nominaBruta<1500) {
			retencion=(float) 0.15;
		}else if(nominaBruta>1500) {
			retencion=(float) 0.18;
		}
		return nominaBruta * (1-retencion);
	}

}
