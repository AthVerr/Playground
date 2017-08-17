

public class part_time extends emploee{  //pernei apo tin klasi emploee stoixeia
      
    private 
    int wres_apasxolisis;
    double misthos_wra;
    
    public             
             // stoixeia gia  ypallilo  merikous apasxolisis  
            
   void set_wres_apasxolisis(int wres){ wres_apasxolisis=wres;}
   void set_misthos_wra(double MA){misthos_wra=MA;}
    
   int get_wres_apasxolisis(){return  wres_apasxolisis;}
   double get_misthos_wra(){return misthos_wra;}
    
    part_time(String onoma,String id,String t,int D,double M_A){  //construstor
        super.name=onoma;
        super.arithmos_tautotitas=id;
        super.tmima=t;
        wres_apasxolisis=D;
       misthos_wra=M_A;
    }
    //ypologismos tou telikou mistou
    double get_mistos(){return wres_apasxolisis*misthos_wra;} //sinthiki
   
    //methodos gia to ti tha emfanisei
    public String toString(){
        return "To Onoma tou ypalliou merikis apasxoliseis einai: "+super.get_name()+"me arithmo tautotitas : "+super.get_arithmos_tautotitas()+" sto Tmima: "+super.get_tmima()+" me wres douleias: "+get_wres_apasxolisis()+" kai misto: "+get_mistos();
   
    }   
    
                

}


