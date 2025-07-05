package ru.khtu.platform.common.data.dto.catalog.space.wospace;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class WoSpaceDto {

    private final Long specId;
    private final String woIdTX;
    private final String woNameTX;
    private final String woRecordStateSY;
    private final String woPreviousStateSY;
    private final String woStatusCL;
    private final String woPreviousStatusCL;
    private final String woFormNameSY;
    private final String woAddressTX;
    private final String woKnTX;
    private final String woCommentTX;
    private final String woDescriptionTX;

}
