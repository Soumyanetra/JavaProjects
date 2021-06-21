//import java.com.inet.jortho.SpellChecker;
class WED
{
    public void sa()
    { BasicDictionary dictionary = new BasicDictionary("file://english.jar");

    // load spellchecker configuration from file
    SpellCheckConfiguration configuration = new SpellCheckConfiguration(
        "file://spellCheck.config");

    // create Suggester based on configuration and attach dictionary
    BasicSuggester suggester = new BasicSuggester(configuration);
    suggester.attach(dictionary);

    // create SpellCheck object based on configuration and specify Suggester
    SpellCheck spellCheck = new SpellCheck(configuration);
    spellCheck.setSuggester(suggester);

    // specify max number of suggestions for each misspelt word
    spellCheck.setSuggestionLimit(5);

    // set plain text to verify and specify English rules
    spellCheck.setText(text, Constants.DOC_TYPE_TEXT, "en");

    // check text up to the first misspelt word
    spellCheck.check();
    while (spellCheck.hasMisspelt())
    {
      // get misspelt word
      String misspeltWord = spellCheck.getMisspelt();
      // get text around bolded misspelt word (5 words before and 5 words after)
      String misspeltText = spellCheck.getMisspeltText(5, "<b>", "</b>", 5);

      // get and display misspelt word suggestions
      ArrayList suggestions = spellCheck.getSuggestions();
      for (int j = 0; j < suggestions.size(); j++)
      {
        Suggestion suggestion = (Suggestion) suggestions.get(j);
        System.out.println(j + ": " + suggestion.getWord());
      }

      // choose the suggestion
      System.out.print("Select suggestion (CR - next, q - quit): ");
      String command = keyboardInput.readLine().toLowerCase();
      if (command.length() != 0)
      {
        if ("q".equals(command))
        {
          break;
        }
        int k = 0;
        String selectedWord;
        try
        {
          k = Integer.parseInt(command);
          Suggestion suggestion = (Suggestion) suggestions.get(k);
          selectedWord = suggestion.getWord();
        }
        catch (Exception ex)
        {
          System.out.println("Invalid command!");
          continue;
        }

        // choose the suggestion
        spellCheck.change(selectedWord);
      }

      // verify the rest of a text
      spellCheck.checkNext();
    }

    // get and display corrected text
    text = spellCheck.getText();
    System.out.println("\nCorrected text: " + text);}
}