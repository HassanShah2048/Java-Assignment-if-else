public class EligibilityForProfessionalCourse {
    public  void setEligibility(){
        int math=72;
        int chem=51;
        int phy=65;
        int totalMarks=math+chem+phy;
        int totalMarksOfMathPhy=math+phy;
        if ((totalMarks>=190 || totalMarksOfMathPhy>=140)&&(math>=65&&phy>=55&&chem>=50)){
            System.out.println("candidate is eligible");
        }else {
            System.out.println("candidate is not eligible");
        }

    }
}
