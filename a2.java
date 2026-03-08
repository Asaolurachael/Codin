import java.util.Scanner;

public class Main {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in0);

        System.out.println("Enter the candidate Details");

        System.out.println("Name");
        System name = scanner.next();

        System.out.println("Gender");
        System gender = Scanner.next();

        System.out.println("Enter Percentage in 10th");
        int percentage = scanner.nextInt();

        if (percentage < 50) {
            throw new InvalidInternException("Registration Failed. Percenatge cannot be less than 50%");
        } else{
            Candidate candidate = new Candidate();
            Candidate.setName(name);
            Candidate.setGender(gender);
            Candidate.setPercentage(percentage);

            return candidate;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to intrtifing Tool");

        try{
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
        } catch (Invalidinternal xception e) {
            System.out.println(e.getMessage());
        }
    } 
}