package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.enums.FileType;
import com.matlasystems.chat.common.exceptions.FileStorageException;
import com.matlasystems.chat.common.exceptions.ValidationException;
import com.matlasystems.chat.common.util.FileUtil;
import com.matlasystems.chat.common.util.StringUtil;

/**
 * Performs high-level validation for uploaded files.
 *
 * <p>
 * This validator coordinates file validation by checking the
 * request parameters and delegating file-specific validation
 * to {@link FileUtil}. Any low-level {@link FileStorageException}
 * is converted into a {@link ValidationException} so that the
 * validation layer exposes a consistent exception type.
 */
public final class FileValidator {

    private FileValidator() {
    }

    /**
     * Validates an uploaded file.
     *
     * @param filename uploaded filename
     * @param fileSize file size in bytes
     * @param fileType expected file type
     */
    public static void validate(String filename,
                                long fileSize,
                                FileType fileType) {

        validateFilename(filename);

        validateFileType(fileType);

        try {

            switch (fileType) {

                case IMAGE ->
                        FileUtil.validateImage(
                                filename,
                                fileSize);

                case DOCUMENT ->
                        FileUtil.validateDocument(
                                filename,
                                fileSize);

                case VIDEO ->
                        FileUtil.validateVideo(
                                filename,
                                fileSize);

                case AUDIO ->
                        FileUtil.validateAudio(
                                filename,
                                fileSize);

                default ->
                        throw new ValidationException(
                                "Unsupported file type: "
                                        + fileType);

            }

        } catch (FileStorageException ex) {

            throw new ValidationException(
                    ex.getMessage(),
                    ex);

        }

    }

    /**
     * Validates filename.
     */
    private static void validateFilename(
            String filename) {

        if (StringUtil.isNullOrBlank(filename)) {

            throw new ValidationException(
                    "Filename is required.");

        }

    }

    /**
     * Validates file type.
     */
    private static void validateFileType(
            FileType fileType) {

        if (fileType == null) {

            throw new ValidationException(
                    "File type is required.");

        }

    }

}