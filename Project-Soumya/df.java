class df
{
    public static void main()
    {
        JLanguageTool langTool = new JLanguageTool(Language.AMERICAN_ENGLISH);
langTool.activateDefaultPatternRules();

List<RuleMatch> matches = langTool.check("Hitchhiker's Guide tot he Galaxy");
for (RuleMatch match : matches) {
    System.out.println("Potential error at line " +
        match.getEndLine() + ", column " +
        match.getColumn() + ": " + match.getMessage());
    System.out.println("Suggested correction: " +
        match.getSuggestedReplacements());
}
}
}