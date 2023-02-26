package refresherPractice;
import java.util.*;

class setMatrixZero {
	short mtrx[][] = new short[3][3];
	short factor_mtrx[][] = new short[3][3];
	setMatrixZero() {
		System.out.println("Enter Matrix Data");
		Scanner smz_Sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) 
				mtrx[i][j] = smz_Sc.nextShort();
		smz_Sc.close();
		}

	void dispMtrx () {
		for(int i=0;i<3;i++) 
			for(int j=0;j<4;j++)
				if(j==3)
					System.out.println("");	
				else
					System.out.print(mtrx[i][j]+"     ");
		}

	void calc_factor_mtrx () {
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++)
				factor_mtrx [i][j] = 1;
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++)
				if(mtrx[i][j]==0)
					for(int k=0;k<3;k++)
					{
						factor_mtrx[i][k] = 0;
						factor_mtrx[k][j] = 0;
					}
		System.out.println("factor matrix is as follows");
		for(int i=0;i<3;i++) 
			for(int j=0;j<4;j++)
				if(j==3)
					System.out.println("");	
				else
					System.out.print(factor_mtrx[i][j]+"     ");
	}
	
	void multiply_mtrx () {
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++)
				mtrx[i][j]*=factor_mtrx[i][j];
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setMatrixZero a = new setMatrixZero();
//  		a.setMatrixZero();
		System.out.println("Matrix provided is as follows");
		a.dispMtrx();
		a.calc_factor_mtrx();
		a.multiply_mtrx();
		System.out.println("Zero marked matrix is as follows");
		a.dispMtrx();
	}
}
