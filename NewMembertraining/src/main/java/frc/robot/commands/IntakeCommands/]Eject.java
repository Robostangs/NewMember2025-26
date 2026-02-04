public class EjectCommand extends Command {
  

    @Override
    public void initialize() {
        m_intakeSubsystem.setPercentOutput(-kDefaultIntakeSpeed); 
    }

    @Override
    public void end(boolean interrupted) {
        m_intakeSubsystem.setPercentOutput(0);
    }

    @Override
    public boolean isFinished() {
        return false;
}