
public class full_time extends emploee{  //pernei apo tin klasi emploee stoixeia
    
    private 
    int proipiresia;
    double vasikos_mistos=1000;
    
    public 
         // stoixeia gia  ypallilo  plirous apasxolisis      
    void set_proipiresia(int p) {proipiresia=p;}
    void set_vasikos_mistos(double vas) {vasikos_mistos=vas;}
    int get_proipiresia() {return  proipiresia;}
    double get_vasikos_mistos() {return vasikos_mistos;}
    
    full_time(String onoma,String id,String t,int p){  //construstor
        super.name=onoma;
        super.arithmos_tautotitas=id;
        super.tmima=t;
        proipiresia=p;
    }
    
  public double get_mistos(){  //ypologismos tou telikou mistou
      
        double telikos_mistos=0;
        //athroisi telikou mistou me xronia proipiresias kai analoga prostetw epidoma
        
        if(proipiresia>=0 && proipiresia<5)
            telikos_mistos=vasikos_mistos+100;
        if(proipiresia>=5 && proipiresia<10) 
            telikos_mistos=vasikos_mistos+200;
        if(proipiresia>=10 && proipiresia<15) 
            telikos_mistos=vasikos_mistos+300;
        if(proipiresia>15) 
            telikos_mistos=vasikos_mistos+500;
        
        return telikos_mistos;
    }
    //methodos gia to ti tha emfanisei
    public String toString(){
        return "To Onoma tou ypalliou plirous apasxoliseis einai: "+super.get_name()+"me arithmo tautotitas : "+super.get_arithmos_tautotitas()+" sto Tmima: "+super.get_tmima()+" me proipiresia: "+get_proipiresia()+" kai misto: "+get_mistos();
    }   
    
    
    
    
}
