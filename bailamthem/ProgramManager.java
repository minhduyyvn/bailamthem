package bailamthem;

import java.util.ArrayList;
import java.util.List;
public class    ProgramManager {
    private List<Program> programs;

    public ProgramManager() {
        programs = new ArrayList<>();
    }

    public void addProgram(Program program) {
        programs.add(program);
    }

    public void removeProgram(Program program) {

        program.setName(null);
        program.setAddress(null);
        program.setAge(0);
        program.setSalary(0.0);
    }

    public void updateProgram(Program program, String name, String address, int age, double salary) {
        program.setName(name);
        program.setAddress(address);
        program.setAge(age);
        program.setSalary(salary);
    }

}
