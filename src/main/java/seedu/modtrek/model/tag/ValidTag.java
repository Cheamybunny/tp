package seedu.modtrek.model.tag;

import java.util.Map;

/**
 * Enum class that houses all valid tags and some useful methods for it.
 */
public enum ValidTag {

    // Values
    UNIVERSITY_LEVEL_REQUIREMENTS,
    COMPUTER_SCIENCE_FOUNDATION,
    COMPUTER_SCIENCE_BREADTH_AND_DEPTH,
    IT_PROFESSIONALISM,
    MATHEMATICS_AND_SCIENCES,
    UNRESTRICTED_ELECTIVES,

    // Short-forms Accepted
    ULR, CSF, CSBD, ITP, MS, UE;

    /**
     * Retrieves short form version of the requirement.
     *
     * @param tagName
     * @return ValidTag as the short-form
     */
    public static ValidTag getShortForm(String tagName) {
        tagName = tagName.replace(" ", "_").toUpperCase();
        ValidTag tag = ValidTag.valueOf(tagName);
        switch (tag) {
        case UNIVERSITY_LEVEL_REQUIREMENTS:
            return ULR;
        case COMPUTER_SCIENCE_FOUNDATION:
            return CSF;
        case COMPUTER_SCIENCE_BREADTH_AND_DEPTH:
            return CSBD;
        case IT_PROFESSIONALISM:
            return ITP;
        case MATHEMATICS_AND_SCIENCES:
            return MS;
        case UNRESTRICTED_ELECTIVES:
            return UE;
        default:
            return tag;
        }
    }

    /**
     * Retrieves total credit per requirement.
     *
     * @param tagName
     * @return Total credit
     */
    public static int getTotalCredit(String tagName) {
        Map<ValidTag, Integer> mappedCredits = Map.of(
                ULR, 16,
                CSF, 36,
                CSBD, 40,
                ITP, 12,
                MS, 16,
                UE, 40);
        ValidTag tag = ValidTag.getShortForm(tagName);
        return mappedCredits.get(tag);
    }

    /**
     * Retrieves color for a given tag.
     * @param tagName The name of the given tag.
     * @return The color for the given tag.
     */
    public static String getColor(String tagName) {
        Map<ValidTag, String> mappedColors = Map.of(
                ULR, "red",
                CSF, "blue",
                CSBD, "purple",
                ITP, "orange",
                MS, "green",
                UE, "yellow");
        ValidTag tag = ValidTag.getShortForm(tagName);
        return mappedColors.get(tag);
    }
}
